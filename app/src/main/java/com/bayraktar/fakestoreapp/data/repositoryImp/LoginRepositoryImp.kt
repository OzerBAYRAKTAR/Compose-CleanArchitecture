package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.LoginModel
import com.bayraktar.fakestoreapp.data.model.TokenModel
import com.bayraktar.fakestoreapp.data.remote.api.LoginApiService
import com.bayraktar.fakestoreapp.domain.repository.LoginRepository
import retrofit2.Response
import javax.inject.Inject

class LoginRepositoryImp @Inject constructor(
    private val api: LoginApiService
): LoginRepository{
    override suspend fun getLogin(cart: LoginModel): Response<TokenModel> {
        return api.getLogin(cart)
    }

}