package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class Adjustments(
    val origins_of_ingredients: OriginsOfIngredients? = null,
    val packaging: Packaging? = null,
    val production_system: ProductionSystem? = null,
//    val threatened_species: Any,          // Not sure what type is this
)