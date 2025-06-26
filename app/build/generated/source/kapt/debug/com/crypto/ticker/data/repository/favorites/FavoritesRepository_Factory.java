package com.crypto.ticker.data.repository.favorites;

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
public final class FavoritesRepository_Factory implements Factory<FavoritesRepository> {
  private final Provider<FavoritesDataSource> favoritesDataSourceProvider;

  public FavoritesRepository_Factory(Provider<FavoritesDataSource> favoritesDataSourceProvider) {
    this.favoritesDataSourceProvider = favoritesDataSourceProvider;
  }

  @Override
  public FavoritesRepository get() {
    return newInstance(favoritesDataSourceProvider.get());
  }

  public static FavoritesRepository_Factory create(
      Provider<FavoritesDataSource> favoritesDataSourceProvider) {
    return new FavoritesRepository_Factory(favoritesDataSourceProvider);
  }

  public static FavoritesRepository newInstance(FavoritesDataSource favoritesDataSource) {
    return new FavoritesRepository(favoritesDataSource);
  }
}
