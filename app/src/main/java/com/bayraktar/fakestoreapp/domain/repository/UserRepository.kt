package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.UserApiService
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

interface UserRepository {

    suspend fun getAllUsers(): Response<Users>

    suspend fun getSingleUser(id: Int): Response<UsersItem>

    suspend fun getUserByLimit(limit: Int): Response<Users>
}