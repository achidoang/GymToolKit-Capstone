package com.dicoding.gymtoolkit.domain.repository

import androidx.paging.PagingData
import com.dicoding.gymtoolkit.domain.model.Article
import com.dicoding.gymtoolkit.domain.model.Tool
import kotlinx.coroutines.flow.Flow

interface ToolsRepository {
    fun getTools(data: List<String>): Flow<PagingData<Tool>>

}