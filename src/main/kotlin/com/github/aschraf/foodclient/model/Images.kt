package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class Images(
  val other: Map<String, String>? = null   // TODO: handle
)