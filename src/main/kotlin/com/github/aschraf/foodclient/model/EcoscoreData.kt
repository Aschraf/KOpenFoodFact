package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class EcoscoreData(
    val adjustments: Adjustments,
    val agribalyse: Agribalyse,
    val grade: String,
    val grade_be: String,
    val grade_ch: String,
    val grade_de: String,
    val grade_es: String,
    val grade_fr: String,
    val grade_ie: String,
    val grade_it: String,
    val grade_lu: String,
    val grade_nl: String,
    val missing: Missing,
    val missing_data_warning: Int,
    val score: Int,
    val score_be: Int,
    val score_ch: Int,
    val score_de: Int,
    val score_es: Int,
    val score_fr: Int,
    val score_ie: Int,
    val score_it: Int,
    val score_lu: Int,
    val score_nl: Int,
    val status: String
)