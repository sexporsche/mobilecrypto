package com.crypto.ticker.ui.projectProfile;

import com.crypto.ticker.data.repository.projectProfile.ProjectProfileRepository;
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
public final class ProjectProfileViewModel_AssistedFactory_Factory implements Factory<ProjectProfileViewModel_AssistedFactory> {
  private final Provider<ProjectProfileRepository> repositoryProvider;

  public ProjectProfileViewModel_AssistedFactory_Factory(
      Provider<ProjectProfileRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProjectProfileViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static ProjectProfileViewModel_AssistedFactory_Factory create(
      Provider<ProjectProfileRepository> repositoryProvider) {
    return new ProjectProfileViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static ProjectProfileViewModel_AssistedFactory newInstance(
      Provider<ProjectProfileRepository> repository) {
    return new ProjectProfileViewModel_AssistedFactory(repository);
  }
}
