package com.bayraktar.fakestoreapp.data.remote.authentication

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(@ApplicationContext context: Context): Interceptor  {

    private val tokenManager= TokenManager(context)

    override fun intercept(chain: Interceptor.Chain): Response {
        val token = runBlocking {
            tokenManager.getToken()
        }

        val requestBuilder = chain.request().newBuilder()
            .header("Authorization", "Bearer $token")
            .build()
        return chain.proceed(requestBuilder)
    }
}