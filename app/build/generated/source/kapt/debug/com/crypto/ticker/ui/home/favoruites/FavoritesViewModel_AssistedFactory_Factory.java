package com.crypto.ticker.ui.home.favoruites;

import com.crypto.ticker.data.repository.favorites.FavoritesRepository;
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
public final class FavoritesViewModel_AssistedFactory_Factory implements Factory<FavoritesViewModel_AssistedFactory> {
  private final Provider<FavoritesRepository> repositoryProvider;

  public FavoritesViewModel_AssistedFactory_Factory(
      Provider<FavoritesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavoritesViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static FavoritesViewModel_AssistedFactory_Factory create(
      Provider<FavoritesRepository> repositoryProvider) {
    return new FavoritesViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static FavoritesViewModel_AssistedFactory newInstance(
      Provider<FavoritesRepository> repository) {
    return new FavoritesViewModel_AssistedFactory(repository);
  }
}
