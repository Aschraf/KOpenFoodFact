package com.github.aschraf.foodclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PackagingX(
  @SerialName("ecoscore_material_score") val ecoScoreMaterialScore: Int,
  @SerialName("ecoscore_shape_ratio") val ecoScoreShapeRatio: Int,
  val material: String,
  @SerialName("non_recyclable_and_non_biodegradable") val non_recyclable_and_non_biodegradable: String? = null,
  val shape: String,
)