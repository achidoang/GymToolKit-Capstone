package com.dicoding.gymtoolkit.di

import android.app.Application
import com.dicoding.gymtoolkit.data.manager.LocalUserManagerImpl
import com.dicoding.gymtoolkit.data.remote.NewsApi
import com.dicoding.gymtoolkit.data.repository.NewsRepositoryImpl
import com.dicoding.gymtoolkit.domain.manager.LocalUserManager
import com.dicoding.gymtoolkit.domain.repository.NewsRepository
import com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases
import com.dicoding.gymtoolkit.domain.usecases.app_entry.ReadAppEntry
import com.dicoding.gymtoolkit.domain.usecases.app_entry.SaveAppEntry
import com.dicoding.gymtoolkit.domain.usecases.news.GetNews
import com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases
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

    @Provides
    @Singleton
    fun provideNewsApi(): NewsApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(
        newsApi: NewsApi
    ): NewsRepository {
        return NewsRepositoryImpl(newsApi)
    }

    @Provides
    @Singleton
    fun provideNewsUseCases(
        newsRepository: NewsRepository
    ): NewsUseCases{
        return NewsUseCases(
            getNews = GetNews(newsRepository)
        )
    }
}