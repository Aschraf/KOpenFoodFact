package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class Missing(
  val labels: Int? = null,
  val origins: Int? = null,
  val packagings: Int? = null,
)