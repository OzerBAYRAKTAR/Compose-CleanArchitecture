package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import retrofit2.Response
import javax.inject.Inject

interface CartRepository {
    suspend fun getAllCarts(): Response<Carts>
    suspend fun getSingleCart(id: Int): Response<CartsItem>
    suspend fun getCartsByLimit(limit: Int): Response<Carts>
    suspend fun getUserCarts(id: Int): Response<CartsItem>
    suspend fun createProduct(cart: NewCart): Response<Carts>
    suspend fun deletecart(id: Int): Response<Void>
}