package com.dicoding.gymtoolkit.domain.usecases

import com.dicoding.gymtoolkit.data.remote.dto.request.RegisterRequest
import com.dicoding.gymtoolkit.data.remote.dto.response.RegisterResponse
import com.dicoding.gymtoolkit.domain.model.ApiResponse
import com.dicoding.gymtoolkit.domain.repository.AuthRepository
import com.dicoding.gymtoolkit.domain.repository.UserRepository
import javax.inject.Inject
import com.dicoding.gymtoolkit.util.Result


class RegisterUserUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    suspend operator fun invoke(registerRequestDto: RegisterRequest): Result<RegisterResponse> {
        // Validasi email dan username unik
        if (!isEmailValid(registerRequestDto.email)) {
            return Result.Error("Invalid email format")
        }

        if (!isUsernameUnique(registerRequestDto.username)) {
            return Result.Error("Username already taken")
        }

        // Validasi password
        if (!isPasswordValid(registerRequestDto.password)) {
            return Result.Error("Invalid password format")
        }

        // Panggil repository untuk melakukan registrasi
        return authRepository.registerUser(registerRequestDto)
    }

    private fun isEmailValid(email: String): Boolean {
        // Implementasi validasi email
        // ...
        return TODO("Provide the return value")
    }

    private fun isUsernameUnique(username: String): Boolean {
        // Implementasi validasi username unik
        // ...
        return TODO("Provide the return value")
    }

    private fun isPasswordValid(password: String): Boolean {
        // Implementasi validasi password
        // ...
        return TODO("Provide the return value")
    }
}