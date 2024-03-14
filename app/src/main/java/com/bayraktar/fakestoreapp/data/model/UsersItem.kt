package com.bayraktar.fakestoreapp.data.model

data class UsersItem(
    val address: Address,
    val email: String,
    val id: Int,
    val name: Name,
    val password: String,
    val phone: String,
    val username: String
)