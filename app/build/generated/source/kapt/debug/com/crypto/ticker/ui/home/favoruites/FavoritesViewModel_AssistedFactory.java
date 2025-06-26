package com.crypto.ticker.ui.home.favoruites;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.crypto.ticker.data.repository.favorites.FavoritesRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FavoritesViewModel_AssistedFactory implements ViewModelAssistedFactory<FavoritesViewModel> {
  private final Provider<FavoritesRepository> repository;

  @Inject
  FavoritesViewModel_AssistedFactory(Provider<FavoritesRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public FavoritesViewModel create(@NonNull SavedStateHandle arg0) {
    return new FavoritesViewModel(repository.get());
  }
}
