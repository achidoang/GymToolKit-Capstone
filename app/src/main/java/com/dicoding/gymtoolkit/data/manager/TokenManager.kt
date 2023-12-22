package com.dicoding.gymtoolkit.data.manager

import android.content.Context
import android.content.SharedPreferences

class TokenManager(context: Context) {

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("TokenPrefs", Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

    companion object {
        private const val ACCESS_TOKEN_KEY = "access_token"
        // Jika Anda memiliki refresh token, Anda dapat menambahkannya di sini
        // private const val REFRESH_TOKEN_KEY = "refresh_token"
    }

    var accessToken: String?
        get() = sharedPreferences.getString(ACCESS_TOKEN_KEY, null)
        set(value) {
            editor.putString(ACCESS_TOKEN_KEY, value).apply()
        }

    // Metode untuk menyimpan refresh token jika diperlukan
    // ...

    fun clearTokens() {
        editor.remove(ACCESS_TOKEN_KEY)
        // Hapus refresh token jika diperlukan
        // ...
        editor.apply()
    }
}