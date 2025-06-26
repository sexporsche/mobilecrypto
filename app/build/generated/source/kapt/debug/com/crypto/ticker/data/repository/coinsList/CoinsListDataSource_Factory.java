package com.crypto.ticker.data.repository.coinsList;

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
public final class CoinsListDataSource_Factory implements Factory<CoinsListDataSource> {
  private final Provider<CoinsDatabase> dbProvider;

  public CoinsListDataSource_Factory(Provider<CoinsDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public CoinsListDataSource get() {
    return newInstance(dbProvider.get());
  }

  public static CoinsListDataSource_Factory create(Provider<CoinsDatabase> dbProvider) {
    return new CoinsListDataSource_Factory(dbProvider);
  }

  public static CoinsListDataSource newInstance(CoinsDatabase db) {
    return new CoinsListDataSource(db);
  }
}
