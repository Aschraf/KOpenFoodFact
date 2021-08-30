package com.github.aschraf.foodclient

import com.github.aschraf.foodclient.model.SearchResult
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import kotlinx.serialization.json.Json

suspend fun main() {
  println("Hello World")

  val client = HttpClient(CIO) {
    install(JsonFeature) {
      serializer = KotlinxSerializer(Json {
        isLenient = true
        ignoreUnknownKeys = true
      })
    }

  }


  client.use {

//    val fullProduct : ProductResponse = it.get("https://world.openfoodfacts.org/api/v0/product/737628064502.json")
//     println(fullProduct)


    val nn: SearchResult = it.get("https://us.openfoodfacts.org/cgi/search.pl?action=process&tagtype_0=categories&tag_contains_0=contains&tag_0=breakfast_cereals&tagtype_1=nutrition_grades&tag_contains_1=contains&tag_1=A&additives=without&ingredients_from_palm_oil=without&json=true")
    println(nn.products.first())

  }


}