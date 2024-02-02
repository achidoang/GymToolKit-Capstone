package com.dicoding.gymtoolkit.domain.usecases;

import com.dicoding.gymtoolkit.domain.repository.AuthRepository;
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
public final class RegisterUserUseCase_Factory implements Factory<RegisterUserUseCase> {
  private final Provider<AuthRepository> authRepositoryProvider;

  public RegisterUserUseCase_Factory(Provider<AuthRepository> authRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public RegisterUserUseCase get() {
    return newInstance(authRepositoryProvider.get());
  }

  public static RegisterUserUseCase_Factory create(
      Provider<AuthRepository> authRepositoryProvider) {
    return new RegisterUserUseCase_Factory(authRepositoryProvider);
  }

  public static RegisterUserUseCase newInstance(AuthRepository authRepository) {
    return new RegisterUserUseCase(authRepository);
  }
}
