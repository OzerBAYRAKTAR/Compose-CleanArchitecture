package com.bayraktar.fakestoreapp.util

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("responseStatus")
    val responseStatus: Boolean? = false,

    @SerializedName("responseCode")
    val responseCode: Int? = null,

    @SerializedName("responseMessage")
    val responseMessage: String? = null,

    @SerializedName("data")
    val data: T? = null,
)
