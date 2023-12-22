package com.dicoding.gymtoolkit.data.remote.dto

import com.dicoding.gymtoolkit.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)