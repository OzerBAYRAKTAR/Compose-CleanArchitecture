package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import com.bayraktar.fakestoreapp.data.remote.api.UserApiService
import com.bayraktar.fakestoreapp.domain.repository.UserRepository
import retrofit2.Response
import javax.inject.Inject

class UserRepositoryImp @Inject constructor(
    private val api: UserApiService
):UserRepository {
    override suspend fun getAllUsers(): Response<Users> {
        TODO("Not yet implemented")
    }

    override suspend fun getSingleUser(id: Int): Response<UsersItem> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserByLimit(limit: Int): Response<Users> {
        TODO("Not yet implemented")
    }
}