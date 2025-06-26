package com.crypto.ticker;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.crypto.ticker.api.ApiInterface;
import com.crypto.ticker.core.di.ApplicationModule;
import com.crypto.ticker.core.di.ApplicationModule_ProvideApiClientFactory;
import com.crypto.ticker.core.di.ApplicationModule_ProvideOkHttpClientFactory;
import com.crypto.ticker.core.di.ApplicationModule_ProvidePreferenceStorageFactory;
import com.crypto.ticker.core.di.ApplicationModule_ProvideRetrofitFactory;
import com.crypto.ticker.core.di.ApplicationModule_ProvidesDatabaseFactory;
import com.crypto.ticker.data.local.database.CoinsDatabase;
import com.crypto.ticker.data.local.prefs.PreferenceStorage;
import com.crypto.ticker.data.repository.coinsList.CoinsListDataSource;
import com.crypto.ticker.data.repository.coinsList.CoinsListRemoteDataSource;
import com.crypto.ticker.data.repository.coinsList.CoinsListRepository;
import com.crypto.ticker.data.repository.favorites.FavoritesDataSource;
import com.crypto.ticker.data.repository.favorites.FavoritesRepository;
import com.crypto.ticker.data.repository.projectProfile.ProjectProfileDataSource;
import com.crypto.ticker.data.repository.projectProfile.ProjectProfileRemoteDataSource;
import com.crypto.ticker.data.repository.projectProfile.ProjectProfileRepository;
import com.crypto.ticker.data.repository.settings.SettingsRepository;
import com.crypto.ticker.ui.home.HomeActivity;
import com.crypto.ticker.ui.home.HomeActivityViewModel_AssistedFactory;
import com.crypto.ticker.ui.home.HomeActivityViewModel_AssistedFactory_Factory;
import com.crypto.ticker.ui.home.coinsList.CoinListFragment;
import com.crypto.ticker.ui.home.coinsList.CoinListViewModel_AssistedFactory;
import com.crypto.ticker.ui.home.coinsList.CoinListViewModel_AssistedFactory_Factory;
import com.crypto.ticker.ui.home.favoruites.FavoritesFragment;
import com.crypto.ticker.ui.home.favoruites.FavoritesViewModel_AssistedFactory;
import com.crypto.ticker.ui.home.favoruites.FavoritesViewModel_AssistedFactory_Factory;
import com.crypto.ticker.ui.home.settings.SettingsFragment;
import com.crypto.ticker.ui.home.settings.SettingsViewModel_AssistedFactory;
import com.crypto.ticker.ui.home.settings.SettingsViewModel_AssistedFactory_Factory;
import com.crypto.ticker.ui.projectProfile.ProjectProfileActivity;
import com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel_AssistedFactory;
import com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApp_HiltComponents_ApplicationC extends MyApp_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final ApplicationModule applicationModule;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object apiInterface = new MemoizedSentinel();

  private volatile Object coinsDatabase = new MemoizedSentinel();

  private volatile Object preferenceStorage = new MemoizedSentinel();

  private DaggerMyApp_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam,
      ApplicationModule applicationModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.applicationModule = applicationModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideOkHttpClientFactory.provideOkHttpClient(applicationModule);
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideRetrofitFactory.provideRetrofit(applicationModule, getOkHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ApiInterface getApiInterface() {
    Object local = apiInterface;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiInterface;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvideApiClientFactory.provideApiClient(applicationModule, getRetrofit());
          apiInterface = DoubleCheck.reentrantCheck(apiInterface, local);
        }
      }
    }
    return (ApiInterface) local;
  }

  private CoinsDatabase getCoinsDatabase() {
    Object local = coinsDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = coinsDatabase;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvidesDatabaseFactory.providesDatabase(applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          coinsDatabase = DoubleCheck.reentrantCheck(coinsDatabase, local);
        }
      }
    }
    return (CoinsDatabase) local;
  }

  private PreferenceStorage getPreferenceStorage() {
    Object local = preferenceStorage;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = preferenceStorage;
        if (local instanceof MemoizedSentinel) {
          local = ApplicationModule_ProvidePreferenceStorageFactory.providePreferenceStorage(applicationModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          preferenceStorage = DoubleCheck.reentrantCheck(preferenceStorage, local);
        }
      }
    }
    return (PreferenceStorage) local;
  }

  @Override
  public void injectMyApp(MyApp myApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public MyApp_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (applicationModule == null) {
        this.applicationModule = new ApplicationModule();
      }
      return new DaggerMyApp_HiltComponents_ApplicationC(applicationContextModule, applicationModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public MyApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<CoinsListRepository> coinsListRepositoryProvider;

      private volatile Provider<CoinListViewModel_AssistedFactory> coinListViewModel_AssistedFactoryProvider;

      private volatile Provider<FavoritesRepository> favoritesRepositoryProvider;

      private volatile Provider<FavoritesViewModel_AssistedFactory> favoritesViewModel_AssistedFactoryProvider;

      private volatile Provider<SettingsRepository> settingsRepositoryProvider;

      private volatile Provider<HomeActivityViewModel_AssistedFactory> homeActivityViewModel_AssistedFactoryProvider;

      private volatile Provider<ProjectProfileRepository> projectProfileRepositoryProvider;

      private volatile Provider<ProjectProfileViewModel_AssistedFactory> projectProfileViewModel_AssistedFactoryProvider;

      private volatile Provider<SettingsViewModel_AssistedFactory> settingsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private CoinsListRemoteDataSource getCoinsListRemoteDataSource() {
        return new CoinsListRemoteDataSource(DaggerMyApp_HiltComponents_ApplicationC.this.getApiInterface());
      }

      private CoinsListDataSource getCoinsListDataSource() {
        return new CoinsListDataSource(DaggerMyApp_HiltComponents_ApplicationC.this.getCoinsDatabase());
      }

      private CoinsListRepository getCoinsListRepository() {
        return new CoinsListRepository(getCoinsListRemoteDataSource(), getCoinsListDataSource(), DaggerMyApp_HiltComponents_ApplicationC.this.getPreferenceStorage());
      }

      private Provider<CoinsListRepository> getCoinsListRepositoryProvider() {
        Object local = coinsListRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          coinsListRepositoryProvider = (Provider<CoinsListRepository>) local;
        }
        return (Provider<CoinsListRepository>) local;
      }

      private CoinListViewModel_AssistedFactory getCoinListViewModel_AssistedFactory() {
        return CoinListViewModel_AssistedFactory_Factory.newInstance(getCoinsListRepositoryProvider());
      }

      private Provider<CoinListViewModel_AssistedFactory> getCoinListViewModel_AssistedFactoryProvider(
          ) {
        Object local = coinListViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          coinListViewModel_AssistedFactoryProvider = (Provider<CoinListViewModel_AssistedFactory>) local;
        }
        return (Provider<CoinListViewModel_AssistedFactory>) local;
      }

      private FavoritesDataSource getFavoritesDataSource() {
        return new FavoritesDataSource(DaggerMyApp_HiltComponents_ApplicationC.this.getCoinsDatabase());
      }

      private FavoritesRepository getFavoritesRepository() {
        return new FavoritesRepository(getFavoritesDataSource());
      }

      private Provider<FavoritesRepository> getFavoritesRepositoryProvider() {
        Object local = favoritesRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          favoritesRepositoryProvider = (Provider<FavoritesRepository>) local;
        }
        return (Provider<FavoritesRepository>) local;
      }

      private FavoritesViewModel_AssistedFactory getFavoritesViewModel_AssistedFactory() {
        return FavoritesViewModel_AssistedFactory_Factory.newInstance(getFavoritesRepositoryProvider());
      }

      private Provider<FavoritesViewModel_AssistedFactory> getFavoritesViewModel_AssistedFactoryProvider(
          ) {
        Object local = favoritesViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          favoritesViewModel_AssistedFactoryProvider = (Provider<FavoritesViewModel_AssistedFactory>) local;
        }
        return (Provider<FavoritesViewModel_AssistedFactory>) local;
      }

      private SettingsRepository getSettingsRepository() {
        return new SettingsRepository(DaggerMyApp_HiltComponents_ApplicationC.this.getPreferenceStorage());
      }

      private Provider<SettingsRepository> getSettingsRepositoryProvider() {
        Object local = settingsRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          settingsRepositoryProvider = (Provider<SettingsRepository>) local;
        }
        return (Provider<SettingsRepository>) local;
      }

      private HomeActivityViewModel_AssistedFactory getHomeActivityViewModel_AssistedFactory() {
        return HomeActivityViewModel_AssistedFactory_Factory.newInstance(getSettingsRepositoryProvider());
      }

      private Provider<HomeActivityViewModel_AssistedFactory> getHomeActivityViewModel_AssistedFactoryProvider(
          ) {
        Object local = homeActivityViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          homeActivityViewModel_AssistedFactoryProvider = (Provider<HomeActivityViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeActivityViewModel_AssistedFactory>) local;
      }

      private ProjectProfileDataSource getProjectProfileDataSource() {
        return new ProjectProfileDataSource(DaggerMyApp_HiltComponents_ApplicationC.this.getCoinsDatabase());
      }

      private ProjectProfileRemoteDataSource getProjectProfileRemoteDataSource() {
        return new ProjectProfileRemoteDataSource(DaggerMyApp_HiltComponents_ApplicationC.this.getApiInterface());
      }

      private ProjectProfileRepository getProjectProfileRepository() {
        return new ProjectProfileRepository(getProjectProfileDataSource(), getProjectProfileRemoteDataSource());
      }

      private Provider<ProjectProfileRepository> getProjectProfileRepositoryProvider() {
        Object local = projectProfileRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(7);
          projectProfileRepositoryProvider = (Provider<ProjectProfileRepository>) local;
        }
        return (Provider<ProjectProfileRepository>) local;
      }

      private ProjectProfileViewModel_AssistedFactory getProjectProfileViewModel_AssistedFactory() {
        return ProjectProfileViewModel_AssistedFactory_Factory.newInstance(getProjectProfileRepositoryProvider());
      }

      private Provider<ProjectProfileViewModel_AssistedFactory> getProjectProfileViewModel_AssistedFactoryProvider(
          ) {
        Object local = projectProfileViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          projectProfileViewModel_AssistedFactoryProvider = (Provider<ProjectProfileViewModel_AssistedFactory>) local;
        }
        return (Provider<ProjectProfileViewModel_AssistedFactory>) local;
      }

      private SettingsViewModel_AssistedFactory getSettingsViewModel_AssistedFactory() {
        return SettingsViewModel_AssistedFactory_Factory.newInstance(getSettingsRepositoryProvider());
      }

      private Provider<SettingsViewModel_AssistedFactory> getSettingsViewModel_AssistedFactoryProvider(
          ) {
        Object local = settingsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(8);
          settingsViewModel_AssistedFactoryProvider = (Provider<SettingsViewModel_AssistedFactory>) local;
        }
        return (Provider<SettingsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(5).put("com.crypto.ticker.ui.home.coinsList.CoinListViewModel", (Provider) getCoinListViewModel_AssistedFactoryProvider()).put("com.crypto.ticker.ui.home.favoruites.FavoritesViewModel", (Provider) getFavoritesViewModel_AssistedFactoryProvider()).put("com.crypto.ticker.ui.home.HomeActivityViewModel", (Provider) getHomeActivityViewModel_AssistedFactoryProvider()).put("com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel", (Provider) getProjectProfileViewModel_AssistedFactoryProvider()).put("com.crypto.ticker.ui.home.settings.SettingsViewModel", (Provider) getSettingsViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectHomeActivity(HomeActivity homeActivity) {
      }

      @Override
      public void injectProjectProfileActivity(ProjectProfileActivity projectProfileActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public MyApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectCoinListFragment(CoinListFragment coinListFragment) {
        }

        @Override
        public void injectFavoritesFragment(FavoritesFragment favoritesFragment) {
        }

        @Override
        public void injectSettingsFragment(SettingsFragment settingsFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public MyApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public MyApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.crypto.ticker.ui.home.coinsList.CoinListViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getCoinListViewModel_AssistedFactory();

            case 1: // com.crypto.ticker.data.repository.coinsList.CoinsListRepository 
            return (T) ActivityCImpl.this.getCoinsListRepository();

            case 2: // com.crypto.ticker.ui.home.favoruites.FavoritesViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFavoritesViewModel_AssistedFactory();

            case 3: // com.crypto.ticker.data.repository.favorites.FavoritesRepository 
            return (T) ActivityCImpl.this.getFavoritesRepository();

            case 4: // com.crypto.ticker.ui.home.HomeActivityViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeActivityViewModel_AssistedFactory();

            case 5: // com.crypto.ticker.data.repository.settings.SettingsRepository 
            return (T) ActivityCImpl.this.getSettingsRepository();

            case 6: // com.crypto.ticker.ui.projectProfile.ProjectProfileViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getProjectProfileViewModel_AssistedFactory();

            case 7: // com.crypto.ticker.data.repository.projectProfile.ProjectProfileRepository 
            return (T) ActivityCImpl.this.getProjectProfileRepository();

            case 8: // com.crypto.ticker.ui.home.settings.SettingsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSettingsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
