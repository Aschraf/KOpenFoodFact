package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
class SelectedImageItem {
  private val en: String? = null
  private val fr: String? = null
  private val pl: String? = null
  val url: String?
    get() = listOfNotNull(en, fr, pl).firstOrNull()
}