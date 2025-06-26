package com.crypto.ticker.data.repository.projectProfile;

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
public final class ProjectProfileRepository_Factory implements Factory<ProjectProfileRepository> {
  private final Provider<ProjectProfileDataSource> localDataSourceProvider;

  private final Provider<ProjectProfileRemoteDataSource> remoteDataSourceProvider;

  public ProjectProfileRepository_Factory(
      Provider<ProjectProfileDataSource> localDataSourceProvider,
      Provider<ProjectProfileRemoteDataSource> remoteDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public ProjectProfileRepository get() {
    return newInstance(localDataSourceProvider.get(), remoteDataSourceProvider.get());
  }

  public static ProjectProfileRepository_Factory create(
      Provider<ProjectProfileDataSource> localDataSourceProvider,
      Provider<ProjectProfileRemoteDataSource> remoteDataSourceProvider) {
    return new ProjectProfileRepository_Factory(localDataSourceProvider, remoteDataSourceProvider);
  }

  public static ProjectProfileRepository newInstance(ProjectProfileDataSource localDataSource,
      ProjectProfileRemoteDataSource remoteDataSource) {
    return new ProjectProfileRepository(localDataSource, remoteDataSource);
  }
}
