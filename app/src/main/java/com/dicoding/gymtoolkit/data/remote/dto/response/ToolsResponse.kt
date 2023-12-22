package com.dicoding.gymtoolkit.data.remote.dto.response

import com.dicoding.gymtoolkit.domain.model.Data

data class ToolsResponse(
    val `data`: Data,
    val status: String
)