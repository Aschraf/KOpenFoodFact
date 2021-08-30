package com.github.aschraf.foodclient.model

import kotlinx.serialization.Serializable

@Serializable
data class SearchResult(
    val count: Int,
    val page: Int,
    val page_count: Int,
    val page_size: Int,
    val products: List<Product>,
    val skip: Int,
)