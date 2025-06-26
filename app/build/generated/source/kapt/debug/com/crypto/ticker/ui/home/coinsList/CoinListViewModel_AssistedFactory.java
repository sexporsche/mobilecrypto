package com.crypto.ticker.ui.home.coinsList;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.crypto.ticker.data.repository.coinsList.CoinsListRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CoinListViewModel_AssistedFactory implements ViewModelAssistedFactory<CoinListViewModel> {
  private final Provider<CoinsListRepository> repository;

  @Inject
  CoinListViewModel_AssistedFactory(Provider<CoinsListRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public CoinListViewModel create(@NonNull SavedStateHandle arg0) {
    return new CoinListViewModel(repository.get());
  }
}
