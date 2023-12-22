package com.dicoding.gymtoolkit.domain.repository

import androidx.paging.PagingData
import com.dicoding.gymtoolkit.domain.model.Article
import kotlinx.coroutines.flow.Flow

interface ToolsRepository {
    fun getTools(sources: List<String>): Flow<PagingData<Article>>


}