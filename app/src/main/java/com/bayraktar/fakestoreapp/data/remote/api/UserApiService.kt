package com.bayraktar.fakestoreapp.data.remote.api

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApiService {

    @GET("/users")
    suspend fun getAllUsers(
    ): Response<Users>

    @GET("/users/{id}")
    suspend fun getSingleUser(
        @Path("id") id: Int
    ): Response<UsersItem>

    @GET("/users/{limit}")
    suspend fun getUserByLimit(
        @Path("limit") limit: Int
    ): Response<Users>

}