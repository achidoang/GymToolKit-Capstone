package com.dicoding.gymtoolkit.domain.repository

import com.dicoding.gymtoolkit.data.remote.dto.request.RegisterRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.data.remote.dto.request.LoginRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.LoginResponse
import com.dicoding.gymtoolkit.data.remote.service.AuthService
import com.dicoding.gymtoolkit.util.Result
import retrofit2.Retrofit
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authService: AuthService
) {

    suspend fun registerUser(registerRequestDto: RegisterRequest): Result<RegisterResponse> {
//        // Panggil API register dari AuthService
//        return try {
//            val response = authService.registerUser(registerRequestDto)
//            Result.Success(response)
//        } catch (e: Exception) {
//            Result.Error("Registration failed: ${e.message}")
//        }
        return TODO("Provide the return value")
    }

    suspend fun loginUser(loginRequestDto: LoginRequest): Result<LoginResponse> {
//        // Panggil API login dari AuthService
//        return try {
//            val response = authService.loginUser(loginRequestDto)
//            Result.Success(response)
//        } catch (e: Exception) {
//            Result.Error("Login failed: ${e.message}")
//        }
        return TODO("Provide the return value")
    }

    // Tambahan fungsi-fungsi lain yang mungkin Anda perlukan
    // ...

}