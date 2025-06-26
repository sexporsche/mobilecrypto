package com.crypto.ticker.ui.home.favoruites;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = FavoritesViewModel.class
)
public interface FavoritesViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.crypto.ticker.ui.home.favoruites.FavoritesViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(FavoritesViewModel_AssistedFactory factory);
}
