package com.github.aschraf.foodclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductResponse(
  val product: Product,
  val code: String,
  val status: Int,
  @SerialName("status_verbose") val statusVerbose: String,
)