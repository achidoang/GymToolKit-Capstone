package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.domain.usecases.RegisterUserUseCase;
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
public final class AppModule_ProvideRegisterUserUseCaseFactory implements Factory<RegisterUserUseCase> {
  private final Provider<RegisterUserUseCase> registerUserUseCaseProvider;

  public AppModule_ProvideRegisterUserUseCaseFactory(
      Provider<RegisterUserUseCase> registerUserUseCaseProvider) {
    this.registerUserUseCaseProvider = registerUserUseCaseProvider;
  }

  @Override
  public RegisterUserUseCase get() {
    return provideRegisterUserUseCase(registerUserUseCaseProvider.get());
  }

  public static AppModule_ProvideRegisterUserUseCaseFactory create(
      Provider<RegisterUserUseCase> registerUserUseCaseProvider) {
    return new AppModule_ProvideRegisterUserUseCaseFactory(registerUserUseCaseProvider);
  }

  public static RegisterUserUseCase provideRegisterUserUseCase(
      RegisterUserUseCase registerUserUseCase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRegisterUserUseCase(registerUserUseCase));
  }
}
