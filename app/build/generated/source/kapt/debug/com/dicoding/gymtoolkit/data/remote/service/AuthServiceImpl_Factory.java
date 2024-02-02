package com.dicoding.gymtoolkit.data.remote.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class AuthServiceImpl_Factory implements Factory<AuthServiceImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public AuthServiceImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public AuthServiceImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static AuthServiceImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new AuthServiceImpl_Factory(apiServiceProvider);
  }

  public static AuthServiceImpl newInstance(ApiService apiService) {
    return new AuthServiceImpl(apiService);
  }
}
