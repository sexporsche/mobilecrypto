package com.crypto.ticker.core.di;

import android.content.Context;
import com.crypto.ticker.data.local.database.CoinsDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ApplicationModule_ProvidesDatabaseFactory implements Factory<CoinsDatabase> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvidesDatabaseFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public CoinsDatabase get() {
    return providesDatabase(module, contextProvider.get());
  }

  public static ApplicationModule_ProvidesDatabaseFactory create(ApplicationModule module,
      Provider<Context> contextProvider) {
    return new ApplicationModule_ProvidesDatabaseFactory(module, contextProvider);
  }

  public static CoinsDatabase providesDatabase(ApplicationModule instance, Context context) {
    return Preconditions.checkNotNull(instance.providesDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
