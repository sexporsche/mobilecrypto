package com.crypto.ticker.ui.projectProfile;

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
    topLevelClass = ProjectProfileViewModel.class
)
public interface ProjectProfileViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      ProjectProfileViewModel_AssistedFactory factory);
}
