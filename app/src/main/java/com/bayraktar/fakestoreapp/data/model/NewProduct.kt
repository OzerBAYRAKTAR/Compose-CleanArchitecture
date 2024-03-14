package com.bayraktar.fakestoreapp.data.model

data class NewProduct(
    val category: String,
    val description: String,
    val image: String,
    val price: Double,
    val title: String
)