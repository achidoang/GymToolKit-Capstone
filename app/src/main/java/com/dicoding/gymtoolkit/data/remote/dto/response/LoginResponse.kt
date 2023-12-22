package com.dicoding.gymtoolkit.data.remote.dto.response

import com.dicoding.gymtoolkit.data.remote.dto.LoginResult

data class LoginResponse(
    val status: String,
    val message: String,
    val loginResult: LoginResult? // LoginResultDto bisa Anda tentukan sesuai kebutuhan
)