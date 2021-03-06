package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class OriginsOfIngredients(
  val aggregated_origins: List<AggregatedOrigin>,
  val epi_score: Int,
  val epi_value: Int,
  val origins_from_origins_field: List<String>,
  val transportation_score_be: Int,
  val transportation_score_ch: Int,
  val transportation_score_de: Int,
  val transportation_score_es: Int,
  val transportation_score_fr: Int,
  val transportation_score_ie: Int,
  val transportation_score_it: Int,
  val transportation_score_lu: Int,
  val transportation_score_nl: Int,
  val transportation_value_be: Int,
  val transportation_value_ch: Int,
  val transportation_value_de: Int,
  val transportation_value_es: Int,
  val transportation_value_fr: Int,
  val transportation_value_ie: Int,
  val transportation_value_it: Int,
  val transportation_value_lu: Int,
  val transportation_value_nl: Int,
  val value_be: Int,
  val value_ch: Int,
  val value_de: Int,
  val value_es: Int,
  val value_fr: Int,
  val value_ie: Int,
  val value_it: Int,
  val value_lu: Int,
  val value_nl: Int,
  val warning: String? = null,
)