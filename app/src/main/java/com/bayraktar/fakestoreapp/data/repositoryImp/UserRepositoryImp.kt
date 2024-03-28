package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import com.bayraktar.fakestoreapp.data.remote.api.UserApiService
import com.bayraktar.fakestoreapp.domain.repository.UserRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class UserRepositoryImp @Inject constructor(
    private val api: UserApiService
):UserRepository {
    override suspend fun getAllUsers(): Flow<APIResponse<Users>> {
        return api.getAllUsers()
    }

    override suspend fun getSingleUser(id: Int): Flow<APIResponse<UsersItem>> {
        return api.getSingleUser(id)
    }

    override suspend fun getUserByLimit(limit: Int): Flow<APIResponse<Users>> {
        return api.getUserByLimit(limit)
    }

}