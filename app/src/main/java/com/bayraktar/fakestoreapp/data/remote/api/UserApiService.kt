package com.bayraktar.fakestoreapp.data.remote.api

import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApiService {

    @GET("/users")
    suspend fun getAllUsers(
    ): Response<APIResponse<List<UsersItem>>>

    @GET("/users/{id}")
    suspend fun getSingleUser(
        @Path("id") id: Int
    ): Response<APIResponse<UsersItem>>

    @GET("/users/{limit}")
    suspend fun getUserByLimit(
        @Path("limit") limit: Int
    ): Response<APIResponse<List<UsersItem>>>

}
