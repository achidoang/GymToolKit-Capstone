package com.dicoding.gymtoolkit.data.remote.service

import com.dicoding.gymtoolkit.data.remote.dto.request.LoginRequest
import com.dicoding.gymtoolkit.data.remote.dto.request.RegisterRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.LoginResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.ToolsResponse
import com.dicoding.gymtoolkit.util.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthService {

    suspend fun registerUser(registerRequestDto: RegisterRequest): Result<RegisterResponse>

    suspend fun loginUser(loginRequestDto: LoginRequest): Result<LoginResponse>

    // Metode-metode lain sesuai kebutuhan
    // ...
}
