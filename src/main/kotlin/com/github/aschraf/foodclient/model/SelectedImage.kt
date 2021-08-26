package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable


@Serializable
data class SelectedImage (
  private val display: SelectedImageItem? = null,
  private val small: SelectedImageItem? = null,
  private val thumb: SelectedImageItem? = null,
)