package com.dicoding.gymtoolkit.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.dicoding.gymtoolkit.domain.usecases.ToolsUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val toolsUsecases: ToolsUseCases

) : ViewModel() {

    var state = mutableStateOf(HomeState())
        private set
    val tools = toolsUsecases.getTools().cachedIn(viewModelScope)


}