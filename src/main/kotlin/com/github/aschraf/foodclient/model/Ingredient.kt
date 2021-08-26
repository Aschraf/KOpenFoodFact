package com.github.aschraf.foodclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ingredient(
  @SerialName("from_palm_oil") private val fromPalmOil: String? = null,
  private val id: String? = null,
  private val origin: String? = null,
  private val percent: String? = null,
  private val rank: Int = 0,
  private val text: String? = null,
  private val vegan: String? = null,
  private val vegetarian: String? = null,
)