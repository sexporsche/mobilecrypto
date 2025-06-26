package com.crypto.ticker.core.di;

import android.content.Context;
import com.crypto.ticker.data.local.prefs.PreferenceStorage;
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
public final class ApplicationModule_ProvidePreferenceStorageFactory implements Factory<PreferenceStorage> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvidePreferenceStorageFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferenceStorage get() {
    return providePreferenceStorage(module, contextProvider.get());
  }

  public static ApplicationModule_ProvidePreferenceStorageFactory create(ApplicationModule module,
      Provider<Context> contextProvider) {
    return new ApplicationModule_ProvidePreferenceStorageFactory(module, contextProvider);
  }

  public static PreferenceStorage providePreferenceStorage(ApplicationModule instance,
      Context context) {
    return Preconditions.checkNotNull(instance.providePreferenceStorage(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
