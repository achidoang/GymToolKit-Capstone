package com.dicoding.gymtoolkit.data.remote.service

import com.dicoding.gymtoolkit.data.remote.dto.request.LoginRequest
import com.dicoding.gymtoolkit.data.remote.dto.request.RegisterRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.LoginResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.ToolsResponse
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class AuthServiceImpl @Inject constructor(
    private val apiService: ApiService
) : AuthService {

    override suspend fun registerUser(registerRequestDto: RegisterRequest): Result<RegisterResponse> {
        // Logika bisnis tambahan jika diperlukan
        // Panggil metode registrasi dari ApiService
        // ...
        return TODO("Provide the return value")
    }

    override suspend fun loginUser(loginRequestDto: LoginRequest): Result<LoginResponse> {
        // Logika bisnis tambahan jika diperlukan
        // Panggil metode login dari ApiService
        // ...
        return TODO("Provide the return value")
    }

    // Implementasi metode-metode lain jika diperlukan
    // ...
}
