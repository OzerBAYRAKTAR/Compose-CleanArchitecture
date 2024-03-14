package com.bayraktar.fakestoreapp.data.model

data class CartsItem(
    val date: String,
    val id: Int,
    val products: List<Product>,
    val userId: Int
)