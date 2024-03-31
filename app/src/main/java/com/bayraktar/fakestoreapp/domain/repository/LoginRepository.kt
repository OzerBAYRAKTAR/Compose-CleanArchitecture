package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.LoginModel
import com.bayraktar.fakestoreapp.data.model.TokenModel
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.LoginApiService
import com.bayraktar.fakestoreapp.util.APIResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Body
import javax.inject.Inject

interface LoginRepository {

    suspend fun getLogin(@Body cart: LoginModel): Flow<APIResponse<TokenModel>>
}