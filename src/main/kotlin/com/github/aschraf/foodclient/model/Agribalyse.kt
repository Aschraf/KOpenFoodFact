package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class Agribalyse(
  val agribalyse_food_code: String? = null,
  val agribalyse_proxy_food_code: String? = null,
  val co2_agriculture: String? = null,
  val co2_consumption: String? = null,
  val co2_distribution: String? = null,
  val co2_packaging: String? = null,
  val co2_processing: String? = null,
  val co2_total: String? = null,
  val co2_transportation: String? = null,
  val code: String? = null,
  val dqr: String? = null,
  val ef_agriculture: String? = null,
  val ef_consumption: String? = null,
  val ef_distribution: String? = null,
  val ef_packaging: String? = null,
  val ef_processing: String? = null,
  val ef_total: String? = null,
  val ef_transportation: String? = null,
  val is_beverage: Int? = null,
  val name_en: String? = null,
  val name_fr: String? = null,
  val score: Int? = null,
)