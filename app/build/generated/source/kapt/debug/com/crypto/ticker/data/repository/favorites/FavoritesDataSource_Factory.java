package com.crypto.ticker.data.repository.favorites;

import com.crypto.ticker.data.local.database.CoinsDatabase;
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
public final class FavoritesDataSource_Factory implements Factory<FavoritesDataSource> {
  private final Provider<CoinsDatabase> dbProvider;

  public FavoritesDataSource_Factory(Provider<CoinsDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FavoritesDataSource get() {
    return newInstance(dbProvider.get());
  }

  public static FavoritesDataSource_Factory create(Provider<CoinsDatabase> dbProvider) {
    return new FavoritesDataSource_Factory(dbProvider);
  }

  public static FavoritesDataSource newInstance(CoinsDatabase db) {
    return new FavoritesDataSource(db);
  }
}
