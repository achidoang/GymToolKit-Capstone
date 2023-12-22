package com.dicoding.gymtoolkit.domain.usecases.app_entry

import com.dicoding.gymtoolkit.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(

    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}