package com.dicoding.gymtoolkit.domain.repository

import androidx.paging.PagingData
import com.dicoding.gymtoolkit.domain.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getNews(sources: List<String>): Flow<PagingData<Article>>
}