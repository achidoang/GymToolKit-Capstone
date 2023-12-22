package com.dicoding.gymtoolkit.data.repository

import com.dicoding.gymtoolkit.data.remote.dto.request.LoginRequest
import com.dicoding.gymtoolkit.data.remote.dto.request.RegisterRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.LoginResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.data.remote.service.AuthService
import com.dicoding.gymtoolkit.domain.model.ApiResponse
import com.dicoding.gymtoolkit.domain.repository.UserRepository
import javax.inject.Inject

//class UserRepositoryImpl @Inject constructor(
//    private val authService: AuthService
//) : UserRepository {
//
//    override suspend fun registerUser(username: String, email: String, password: String): ApiResponse<RegisterResponse> {
//        val request = RegisterRequest(username, email, password)
//        val response = authService.register(request)
//        // Handle response, misalnya, ubah Response<RegistrationResponse> menjadi ApiResponse<RegistrationResponse>.
//    }
//
//    override suspend fun loginUser(username: String, password: String): ApiResponse<LoginResponse> {
//        val request = LoginRequest(username, password)
//        val response = authService.login(request)
//        // Handle response, misalnya, ubah Response<LoginResponse> menjadi ApiResponse<LoginResponse>.
//    }
//
//    // Implementasikan operasi lain sesuai kebutuhan.
//}