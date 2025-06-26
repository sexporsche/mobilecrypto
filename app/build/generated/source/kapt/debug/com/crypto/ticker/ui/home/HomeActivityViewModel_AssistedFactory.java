package com.crypto.ticker.ui.home;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.crypto.ticker.data.repository.settings.SettingsRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeActivityViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeActivityViewModel> {
  private final Provider<SettingsRepository> repository;

  @Inject
  HomeActivityViewModel_AssistedFactory(Provider<SettingsRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public HomeActivityViewModel create(@NonNull SavedStateHandle arg0) {
    return new HomeActivityViewModel(repository.get());
  }
}
