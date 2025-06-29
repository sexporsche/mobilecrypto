package com.crypto.ticker.ui.home;

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
    topLevelClass = HomeActivityViewModel.class
)
public interface HomeActivityViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.crypto.ticker.ui.home.HomeActivityViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(HomeActivityViewModel_AssistedFactory factory);
}
