package com.crypto.ticker.ui.home;

import com.crypto.ticker.data.repository.settings.SettingsRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeActivityViewModel_AssistedFactory_Factory implements Factory<HomeActivityViewModel_AssistedFactory> {
  private final Provider<SettingsRepository> repositoryProvider;

  public HomeActivityViewModel_AssistedFactory_Factory(
      Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomeActivityViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static HomeActivityViewModel_AssistedFactory_Factory create(
      Provider<SettingsRepository> repositoryProvider) {
    return new HomeActivityViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static HomeActivityViewModel_AssistedFactory newInstance(
      Provider<SettingsRepository> repository) {
    return new HomeActivityViewModel_AssistedFactory(repository);
  }
}
