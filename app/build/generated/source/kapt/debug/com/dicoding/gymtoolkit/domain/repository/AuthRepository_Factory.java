package com.dicoding.gymtoolkit.domain.repository;

import com.dicoding.gymtoolkit.data.remote.service.AuthService;
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<AuthService> authServiceProvider;

  public AuthRepository_Factory(Provider<AuthService> authServiceProvider) {
    this.authServiceProvider = authServiceProvider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(authServiceProvider.get());
  }

  public static AuthRepository_Factory create(Provider<AuthService> authServiceProvider) {
    return new AuthRepository_Factory(authServiceProvider);
  }

  public static AuthRepository newInstance(AuthService authService) {
    return new AuthRepository(authService);
  }
}
