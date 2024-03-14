package com.bayraktar.fakestoreapp.data.model

data class NewCart(
    val date: String,
    val products: List<Product>,
    val userId: Int
)
