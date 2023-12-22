package com.dicoding.gymtoolkit.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/dicoding/gymtoolkit/di/AppModule;", "", "()V", "provideAppEntryUseCases", "Lcom/dicoding/gymtoolkit/domain/usecases/app_entry/AppEntryUseCases;", "localUserManager", "Lcom/dicoding/gymtoolkit/domain/manager/LocalUserManager;", "provideLocalUserManager", "application", "Landroid/app/Application;", "provideNewsApi", "Lcom/dicoding/gymtoolkit/data/remote/NewsApi;", "provideNewsRepository", "Lcom/dicoding/gymtoolkit/domain/repository/NewsRepository;", "newsApi", "provideNewsUseCases", "Lcom/dicoding/gymtoolkit/domain/usecases/news/NewsUseCases;", "newsRepository", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.gymtoolkit.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.manager.LocalUserManager provideLocalUserManager(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases provideAppEntryUseCases(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.manager.LocalUserManager localUserManager) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.data.remote.NewsApi provideNewsApi() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.repository.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.data.remote.NewsApi newsApi) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.dicoding.gymtoolkit.domain.usecases.news.NewsUseCases provideNewsUseCases(@org.jetbrains.annotations.NotNull
    com.dicoding.gymtoolkit.domain.repository.NewsRepository newsRepository) {
        return null;
    }
}