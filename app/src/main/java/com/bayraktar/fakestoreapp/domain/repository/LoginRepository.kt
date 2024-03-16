package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.LoginModel
import com.bayraktar.fakestoreapp.data.model.TokenModel
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.LoginApiService
import retrofit2.Response
import retrofit2.http.Body
import javax.inject.Inject

interface LoginRepository {

    suspend fun getLogin(@Body cart: LoginModel): Response<TokenModel>
}