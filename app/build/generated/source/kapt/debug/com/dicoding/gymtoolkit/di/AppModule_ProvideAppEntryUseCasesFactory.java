package com.dicoding.gymtoolkit.di;

import com.dicoding.gymtoolkit.domain.manager.LocalUserManager;
import com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases;
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
public final class AppModule_ProvideAppEntryUseCasesFactory implements Factory<AppEntryUseCases> {
  private final Provider<LocalUserManager> localUserManagerProvider;

  public AppModule_ProvideAppEntryUseCasesFactory(
      Provider<LocalUserManager> localUserManagerProvider) {
    this.localUserManagerProvider = localUserManagerProvider;
  }

  @Override
  public AppEntryUseCases get() {
    return provideAppEntryUseCases(localUserManagerProvider.get());
  }

  public static AppModule_ProvideAppEntryUseCasesFactory create(
      Provider<LocalUserManager> localUserManagerProvider) {
    return new AppModule_ProvideAppEntryUseCasesFactory(localUserManagerProvider);
  }

  public static AppEntryUseCases provideAppEntryUseCases(LocalUserManager localUserManager) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppEntryUseCases(localUserManager));
  }
}
