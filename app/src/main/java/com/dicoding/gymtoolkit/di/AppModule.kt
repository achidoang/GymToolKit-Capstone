package com.dicoding.gymtoolkit.di

import android.app.Application
import com.dicoding.gymtoolkit.data.manager.LocalUserManagerImpl
import com.dicoding.gymtoolkit.data.remote.service.AuthService
import com.dicoding.gymtoolkit.domain.manager.LocalUserManager
import com.dicoding.gymtoolkit.domain.usecases.RegisterUserUseCase
import com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases
import com.dicoding.gymtoolkit.domain.usecases.app_entry.ReadAppEntry
import com.dicoding.gymtoolkit.domain.usecases.app_entry.SaveAppEntry
import com.dicoding.gymtoolkit.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)


    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

    // Menambahkan Dependensi Retrofit di AppModule
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthService(retrofit: Retrofit): AuthService {
        return retrofit.create(AuthService::class.java)
    }

    @Provides
    @Singleton
    fun provideRegisterUserUseCase(registerUserUseCase: RegisterUserUseCase): RegisterUserUseCase {
        return registerUserUseCase
    }

}