package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class ProductionSystem(
  val label: String? = null,
  val value: Int? = null,
  val warning: String? = null,
)