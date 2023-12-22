package com.dicoding.gymtoolkit.domain.model

import retrofit2.Response

sealed class ApiResponse<out T : Any> {
    data class Success<out T : Any>(val data: T) : ApiResponse<T>()
    data class Error(val message: String) : ApiResponse<Nothing>()
}

fun <T : Any> Response<T>.toApiResponse(): ApiResponse<T> {
    return if (isSuccessful) {
        body()?.let {
            ApiResponse.Success(it)
        } ?: ApiResponse.Error("Response body is null")
    } else {
        ApiResponse.Error(errorBody()?.string() ?: "Unknown error")
    }
}