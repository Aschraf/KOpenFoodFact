package com.github.aschraf.foodclient

import com.github.aschraf.foodclient.model.ProductResponse
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import kotlinx.serialization.json.Json

suspend fun main() {
  println("Hello World")

  val result: ProductResponse = HttpClient(CIO) {
    install(JsonFeature) {
      serializer = KotlinxSerializer(Json {
        isLenient = true
        ignoreUnknownKeys = true
      })
    }

  }.use {
    it.get("https://world.openfoodfacts.org/api/v0/product/737628064502.json")
  }

  println(result)

}