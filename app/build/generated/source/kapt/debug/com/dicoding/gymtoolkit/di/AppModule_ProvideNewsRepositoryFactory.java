package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.data.remote.NewsApi;
import com.dicoding.gymtoolkit.domain.repository.NewsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideNewsRepositoryFactory implements Factory<NewsRepository> {
  private final Provider<NewsApi> newsApiProvider;

  public AppModule_ProvideNewsRepositoryFactory(Provider<NewsApi> newsApiProvider) {
    this.newsApiProvider = newsApiProvider;
  }

  @Override
  public NewsRepository get() {
    return provideNewsRepository(newsApiProvider.get());
  }

  public static AppModule_ProvideNewsRepositoryFactory create(Provider<NewsApi> newsApiProvider) {
    return new AppModule_ProvideNewsRepositoryFactory(newsApiProvider);
  }

  public static NewsRepository provideNewsRepository(NewsApi newsApi) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNewsRepository(newsApi));
  }
}
