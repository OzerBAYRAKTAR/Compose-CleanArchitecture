package com.bayraktar.fakestoreapp.data.remote.api

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CartApiService {


    @GET("/carts")
    suspend fun getAllCarts(
    ): Response<Carts>

    @GET("/carts/{id}")
    suspend fun getSingleCart(
        @Path("id") id: Int
    ): Response<CartsItem>

    @GET("/carts/{limit}")
    suspend fun getCartsByLimit(
        @Path("limit") limit: Int
    ): Response<Carts>

    @GET("carts/user/{id}")
    suspend fun getUserCarts(
        @Path("id") id: Int
    ): Response<Carts>

    @POST("/carts")
    suspend fun createProduct(@Body cart: NewCart): Response<Carts>


    @DELETE("carts/{id}")
    suspend fun deletecart(
        @Path("id") id: Int
    ): Response<Void>

}