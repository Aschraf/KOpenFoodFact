package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class AggregatedOrigin(
    val origin: String,
    val percent: Int
)