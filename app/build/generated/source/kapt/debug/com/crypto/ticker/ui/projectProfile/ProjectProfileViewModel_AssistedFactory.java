package com.crypto.ticker.ui.projectProfile;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.crypto.ticker.data.repository.projectProfile.ProjectProfileRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ProjectProfileViewModel_AssistedFactory implements ViewModelAssistedFactory<ProjectProfileViewModel> {
  private final Provider<ProjectProfileRepository> repository;

  @Inject
  ProjectProfileViewModel_AssistedFactory(Provider<ProjectProfileRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public ProjectProfileViewModel create(@NonNull SavedStateHandle arg0) {
    return new ProjectProfileViewModel(repository.get());
  }
}
