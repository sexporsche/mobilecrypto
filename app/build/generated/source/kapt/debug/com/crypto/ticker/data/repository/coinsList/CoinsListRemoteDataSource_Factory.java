package com.crypto.ticker.data.repository.coinsList;

import com.crypto.ticker.api.ApiInterface;
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
public final class CoinsListRemoteDataSource_Factory implements Factory<CoinsListRemoteDataSource> {
  private final Provider<ApiInterface> serviceProvider;

  public CoinsListRemoteDataSource_Factory(Provider<ApiInterface> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public CoinsListRemoteDataSource get() {
    return newInstance(serviceProvider.get());
  }

  public static CoinsListRemoteDataSource_Factory create(Provider<ApiInterface> serviceProvider) {
    return new CoinsListRemoteDataSource_Factory(serviceProvider);
  }

  public static CoinsListRemoteDataSource newInstance(ApiInterface service) {
    return new CoinsListRemoteDataSource(service);
  }
}
