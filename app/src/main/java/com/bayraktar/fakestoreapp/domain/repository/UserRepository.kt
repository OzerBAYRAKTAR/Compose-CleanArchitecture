package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.UserApiService
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

interface UserRepository {

    suspend fun getAllUsers(): Flow<APIResponse<BaseResponse<Users>>>

    suspend fun getSingleUser(id: Int): Flow<APIResponse<BaseResponse<UsersItem>>>

    suspend fun getUserByLimit(limit: Int): Flow<APIResponse<BaseResponse<Users>>>
}