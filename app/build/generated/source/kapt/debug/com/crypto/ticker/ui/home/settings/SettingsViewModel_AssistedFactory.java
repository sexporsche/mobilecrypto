package com.crypto.ticker.ui.home.settings;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.crypto.ticker.data.repository.settings.SettingsRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SettingsViewModel_AssistedFactory implements ViewModelAssistedFactory<SettingsViewModel> {
  private final Provider<SettingsRepository> repository;

  @Inject
  SettingsViewModel_AssistedFactory(Provider<SettingsRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public SettingsViewModel create(@NonNull SavedStateHandle arg0) {
    return new SettingsViewModel(repository.get());
  }
}
