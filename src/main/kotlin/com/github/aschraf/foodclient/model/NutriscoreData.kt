package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class NutriscoreData(
    val energy: Float,
    val energy_points: Float,
    val energy_value: Float,
    val fiber: Float,
    val fiber_points: Float,
    val fiber_value: Float,
    val fruits_vegetables_nuts_colza_walnut_olive_oils: Float,
    val fruits_vegetables_nuts_colza_walnut_olive_oils_points: Float,
    val fruits_vegetables_nuts_colza_walnut_olive_oils_value: Float,
    val grade: String,
    val is_beverage: Float,
    val is_cheese: Float,
    val is_fat: Float,
    val is_water: Float,
    val negative_points: Float,
    val positive_points: Float,
    val proteins: Float,
    val proteins_points: Float,
    val proteins_value: Float,
    val saturated_fat: Double,
    val saturated_fat_points: Float,
    val saturated_fat_ratio: Double,
    val saturated_fat_ratio_points: Float,
    val saturated_fat_ratio_value: Double,
    val saturated_fat_value: Double,
    val score: Float,
    val sodium: Float,
    val sodium_points: Float,
    val sodium_value: Float,
    val sugars: Double,
    val sugars_points: Float,
    val sugars_value: Double
)