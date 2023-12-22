package com.dicoding.gymtoolkit.domain.repository

import com.dicoding.gymtoolkit.data.remote.dto.response.LoginResponse
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.domain.model.ApiResponse

interface UserRepository {
    suspend fun registerUser(username: String, email: String, password: String): ApiResponse<RegisterResponse>
    suspend fun loginUser(username: String, password: String): ApiResponse<LoginResponse>
    // Tambahkan operasi lain sesuai kebutuhan.
}