package com.dicoding.gymtoolkit.data.remote.service

import com.dicoding.gymtoolkit.data.remote.dto.request.LoginRequest
import com.dicoding.gymtoolkit.data.remote.dto.request.RegisterRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.LoginResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.ToolsResponse
import com.dicoding.gymtoolkit.util.Constants
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiService {

    @POST("/users/register")
    suspend fun registerUser(@Body registerRequestDto: RegisterRequest): RegisterResponse

    @POST("/authentications/login")
    suspend fun loginUser(@Body loginRequestDto: LoginRequest): LoginResponse

    @GET("everything")
    suspend fun getTools(
        @Query("sources") sources: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    ): ToolsResponse

    // Tambahkan metode-metode lain sesuai kebutuhan
    // ...
}