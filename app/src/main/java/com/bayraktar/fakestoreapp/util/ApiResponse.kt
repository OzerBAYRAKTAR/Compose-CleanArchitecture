package com.bayraktar.fakestoreapp.util

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response



sealed class APIResponse<out T>(val status: APIStatus, val data: T?, val errorMsg: String?) {
    class Loading<T>(data: T? = null) : APIResponse<T>(APIStatus.LOADING, data, null)

    class Success<T>(data: T?) : APIResponse<T>(APIStatus.SUCCESS, data, null)

    class Error<T>(data: T? = null, errorMsg: String? = null) :
        APIResponse<T>(APIStatus.ERROR, data, errorMsg)
}
enum class APIStatus {
    LOADING, SUCCESS, ERROR
}

