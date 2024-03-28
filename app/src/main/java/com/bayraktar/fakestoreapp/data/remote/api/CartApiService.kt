package com.bayraktar.fakestoreapp.data.remote.api

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CartApiService {


    @GET("/carts")
    suspend fun getAllCarts(
    ): Response<APIResponse<List<CartsItem>>>

    @GET("/carts/{id}")
    suspend fun getSingleCart(
        @Path("id") id: Int
    ): Response<APIResponse<CartsItem>>

    @GET("/carts/{limit}")
    suspend fun getCartsByLimit(
        @Path("limit") limit: Int
    ): Response<APIResponse<List<CartsItem>>>

    @GET("carts/user/{id}")
    suspend fun getUserCarts(
        @Path("id") id: Int
    ): Response<APIResponse<CartsItem>>

    @POST("/carts")
    suspend fun createProduct(@Body cart: NewCart
    ): Response<APIResponse<CartsItem>>


    @DELETE("carts/{id}")
    suspend fun deletecart(
        @Path("id") id: Int
    ): Response<APIResponse<Void>>
}