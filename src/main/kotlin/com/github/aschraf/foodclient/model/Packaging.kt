package com.github.aschraf.foodclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Packaging(
   @SerialName("non_recyclable_and_non_biodegradable_materials") val nonRecyclableAndNonBiodegradableMaterials: Int? = null,
    val packagings: List<PackagingX>? = null,
    val score: Int? = null,
    val value: Int? = null,
    val warning: String? = null,
)