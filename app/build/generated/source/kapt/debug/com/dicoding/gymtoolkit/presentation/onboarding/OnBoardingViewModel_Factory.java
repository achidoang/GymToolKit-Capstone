package com.dicoding.gymtoolkit.presentation.onboarding;

import com.dicoding.gymtoolkit.domain.usecases.app_entry.AppEntryUseCases;
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
public final class OnBoardingViewModel_Factory implements Factory<OnBoardingViewModel> {
  private final Provider<AppEntryUseCases> appEntryUseCasesProvider;

  public OnBoardingViewModel_Factory(Provider<AppEntryUseCases> appEntryUseCasesProvider) {
    this.appEntryUseCasesProvider = appEntryUseCasesProvider;
  }

  @Override
  public OnBoardingViewModel get() {
    return newInstance(appEntryUseCasesProvider.get());
  }

  public static OnBoardingViewModel_Factory create(
      Provider<AppEntryUseCases> appEntryUseCasesProvider) {
    return new OnBoardingViewModel_Factory(appEntryUseCasesProvider);
  }

  public static OnBoardingViewModel newInstance(AppEntryUseCases appEntryUseCases) {
    return new OnBoardingViewModel(appEntryUseCases);
  }
}
