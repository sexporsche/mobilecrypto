package com.crypto.ticker.data.repository.projectProfile;

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
public final class ProjectProfileRemoteDataSource_Factory implements Factory<ProjectProfileRemoteDataSource> {
  private final Provider<ApiInterface> serviceProvider;

  public ProjectProfileRemoteDataSource_Factory(Provider<ApiInterface> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ProjectProfileRemoteDataSource get() {
    return newInstance(serviceProvider.get());
  }

  public static ProjectProfileRemoteDataSource_Factory create(
      Provider<ApiInterface> serviceProvider) {
    return new ProjectProfileRemoteDataSource_Factory(serviceProvider);
  }

  public static ProjectProfileRemoteDataSource newInstance(ApiInterface service) {
    return new ProjectProfileRemoteDataSource(service);
  }
}
