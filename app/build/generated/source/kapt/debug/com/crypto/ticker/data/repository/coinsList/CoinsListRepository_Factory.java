package com.crypto.ticker.data.repository.coinsList;

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
public final class CoinsListRepository_Factory implements Factory<CoinsListRepository> {
  private final Provider<CoinsListRemoteDataSource> coinsListRemoteDataSourceProvider;

  private final Provider<CoinsListDataSource> coinsListDataSourceProvider;

  private final Provider<PreferenceStorage> preferenceStorageProvider;

  public CoinsListRepository_Factory(
      Provider<CoinsListRemoteDataSource> coinsListRemoteDataSourceProvider,
      Provider<CoinsListDataSource> coinsListDataSourceProvider,
      Provider<PreferenceStorage> preferenceStorageProvider) {
    this.coinsListRemoteDataSourceProvider = coinsListRemoteDataSourceProvider;
    this.coinsListDataSourceProvider = coinsListDataSourceProvider;
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public CoinsListRepository get() {
    return newInstance(coinsListRemoteDataSourceProvider.get(), coinsListDataSourceProvider.get(), preferenceStorageProvider.get());
  }

  public static CoinsListRepository_Factory create(
      Provider<CoinsListRemoteDataSource> coinsListRemoteDataSourceProvider,
      Provider<CoinsListDataSource> coinsListDataSourceProvider,
      Provider<PreferenceStorage> preferenceStorageProvider) {
    return new CoinsListRepository_Factory(coinsListRemoteDataSourceProvider, coinsListDataSourceProvider, preferenceStorageProvider);
  }

  public static CoinsListRepository newInstance(CoinsListRemoteDataSource coinsListRemoteDataSource,
      CoinsListDataSource coinsListDataSource, PreferenceStorage preferenceStorage) {
    return new CoinsListRepository(coinsListRemoteDataSource, coinsListDataSource, preferenceStorage);
  }
}
