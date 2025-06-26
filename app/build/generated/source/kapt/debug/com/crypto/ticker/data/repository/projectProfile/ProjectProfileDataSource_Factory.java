package com.crypto.ticker.data.repository.projectProfile;

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
public final class ProjectProfileDataSource_Factory implements Factory<ProjectProfileDataSource> {
  private final Provider<CoinsDatabase> dbProvider;

  public ProjectProfileDataSource_Factory(Provider<CoinsDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ProjectProfileDataSource get() {
    return newInstance(dbProvider.get());
  }

  public static ProjectProfileDataSource_Factory create(Provider<CoinsDatabase> dbProvider) {
    return new ProjectProfileDataSource_Factory(dbProvider);
  }

  public static ProjectProfileDataSource newInstance(CoinsDatabase db) {
    return new ProjectProfileDataSource(db);
  }
}
