package com.dicoding.gymtoolkit.domain.usecases

import androidx.paging.PagingData
import com.dicoding.gymtoolkit.domain.model.Tool
import com.dicoding.gymtoolkit.domain.repository.ToolsRepository
import kotlinx.coroutines.flow.Flow

class GetTools(
    private val toolsRepository: ToolsRepository
) {
    operator fun invoke(): Flow<PagingData<Tool>> {
        return toolsRepository.getTools(data = sources)
    }
}