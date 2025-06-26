package com.crypto.ticker.ui.home.settings;

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
public final class SettingsViewModel_AssistedFactory_Factory implements Factory<SettingsViewModel_AssistedFactory> {
  private final Provider<SettingsRepository> repositoryProvider;

  public SettingsViewModel_AssistedFactory_Factory(
      Provider<SettingsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SettingsViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static SettingsViewModel_AssistedFactory_Factory create(
      Provider<SettingsRepository> repositoryProvider) {
    return new SettingsViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static SettingsViewModel_AssistedFactory newInstance(
      Provider<SettingsRepository> repository) {
    return new SettingsViewModel_AssistedFactory(repository);
  }
}
