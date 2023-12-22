package com.dicoding.gymtoolkit.domain.model

data class Tool(
    val headline: List<String>,
    val id: String,
    val toolsName: String,
    val toolsStep: List<String>,
    val videoUrl: String
)