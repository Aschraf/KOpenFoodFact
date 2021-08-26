package com.github.aschraf.foodclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Source (
  private val fields: List<String>,
  private val id: String? = null,
  private val images: List<String>,
  @SerialName("import_t") private val importT: Long = 0,
  private val manufacturer: String? = null,
  private val name: String? = null,
  private val url: String? = null,
)