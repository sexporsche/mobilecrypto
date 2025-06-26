package com.crypto.ticker.data.repository.settings;

import com.crypto.ticker.data.local.prefs.PreferenceStorage;
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
public final class SettingsRepository_Factory implements Factory<SettingsRepository> {
  private final Provider<PreferenceStorage> preferenceStorageProvider;

  public SettingsRepository_Factory(Provider<PreferenceStorage> preferenceStorageProvider) {
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public SettingsRepository get() {
    return newInstance(preferenceStorageProvider.get());
  }

  public static SettingsRepository_Factory create(
      Provider<PreferenceStorage> preferenceStorageProvider) {
    return new SettingsRepository_Factory(preferenceStorageProvider);
  }

  public static SettingsRepository newInstance(PreferenceStorage preferenceStorage) {
    return new SettingsRepository(preferenceStorage);
  }
}
