package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.data.remote.service.AuthService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideAuthServiceFactory implements Factory<AuthService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideAuthServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AuthService get() {
    return provideAuthService(retrofitProvider.get());
  }

  public static AppModule_ProvideAuthServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideAuthServiceFactory(retrofitProvider);
  }

  public static AuthService provideAuthService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAuthService(retrofit));
  }
}
