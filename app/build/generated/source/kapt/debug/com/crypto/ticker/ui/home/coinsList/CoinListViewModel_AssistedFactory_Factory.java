package com.crypto.ticker.ui.home.coinsList;

import com.crypto.ticker.data.repository.coinsList.CoinsListRepository;
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
public final class CoinListViewModel_AssistedFactory_Factory implements Factory<CoinListViewModel_AssistedFactory> {
  private final Provider<CoinsListRepository> repositoryProvider;

  public CoinListViewModel_AssistedFactory_Factory(
      Provider<CoinsListRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CoinListViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static CoinListViewModel_AssistedFactory_Factory create(
      Provider<CoinsListRepository> repositoryProvider) {
    return new CoinListViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static CoinListViewModel_AssistedFactory newInstance(
      Provider<CoinsListRepository> repository) {
    return new CoinListViewModel_AssistedFactory(repository);
  }
}
