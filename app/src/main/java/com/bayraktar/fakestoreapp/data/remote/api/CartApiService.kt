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
    ): Flow<APIResponse<BaseResponse<Carts>>>

    @GET("/carts/{id}")
    suspend fun getSingleCart(
        @Path("id") id: Int
    ): Flow<APIResponse<BaseResponse<CartsItem>>>

    @GET("/carts/{limit}")
    suspend fun getCartsByLimit(
        @Path("limit") limit: Int
    ): Flow<APIResponse<BaseResponse<Carts>>>

    @GET("carts/user/{id}")
    suspend fun getUserCarts(
        @Path("id") id: Int
    ): Flow<APIResponse<BaseResponse<CartsItem>>>

    @POST("/carts")
    suspend fun createProduct(@Body cart: NewCart
    ): Flow<APIResponse<BaseResponse<Carts>>>


    @DELETE("carts/{id}")
    suspend fun deletecart(
        @Path("id") id: Int
    ): Flow<APIResponse<BaseResponse<Void>>>

}