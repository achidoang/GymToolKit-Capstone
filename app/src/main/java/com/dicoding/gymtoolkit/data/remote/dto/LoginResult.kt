package com.dicoding.gymtoolkit.data.remote.dto

data class LoginResult(
    val status: String,
    val message: String,
    val loginResult: LoginResult? // LoginResultDto bisa Anda tentukan sesuai kebutuhan
)
