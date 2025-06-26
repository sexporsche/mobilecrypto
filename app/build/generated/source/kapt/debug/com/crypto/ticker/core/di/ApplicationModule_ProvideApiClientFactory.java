package com.crypto.ticker.core.di;

import com.crypto.ticker.api.ApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideApiClientFactory implements Factory<ApiInterface> {
  private final ApplicationModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApplicationModule_ProvideApiClientFactory(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiInterface get() {
    return provideApiClient(module, retrofitProvider.get());
  }

  public static ApplicationModule_ProvideApiClientFactory create(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApplicationModule_ProvideApiClientFactory(module, retrofitProvider);
  }

  public static ApiInterface provideApiClient(ApplicationModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideApiClient(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
