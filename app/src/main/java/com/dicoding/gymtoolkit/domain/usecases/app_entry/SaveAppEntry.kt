package com.dicoding.gymtoolkit.domain.usecases.app_entry

import com.dicoding.gymtoolkit.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}