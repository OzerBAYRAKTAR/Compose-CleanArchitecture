package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

interface CartRepository {
    suspend fun getAllCarts(): Flow<APIResponse<List<CartsItem>>>
    suspend fun getSingleCart(id: Int): Flow<APIResponse<CartsItem>>
    suspend fun getCartsByLimit(limit: Int): Flow<APIResponse<List<CartsItem>>>
    suspend fun getUserCarts(id: Int): Flow<APIResponse<CartsItem>>
    suspend fun createProduct(cart: NewCart): Flow<APIResponse<CartsItem>>
    suspend fun deletecart(id: Int): Flow<APIResponse<Void>>
}