package com.crypto.ticker.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/crypto/ticker/ui/home/HomeActivity;", "Lcom/crypto/ticker/core/common/BaseActivity;", "Lcom/crypto/ticker/core/common/NavigationHost;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "navController", "Landroidx/navigation/NavController;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "viewModel", "Lcom/crypto/ticker/ui/home/HomeActivityViewModel;", "getViewModel", "()Lcom/crypto/ticker/ui/home/HomeActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "registerToolbarWithNavigation", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends com.crypto.ticker.core.common.BaseActivity implements com.crypto.ticker.core.common.NavigationHost {
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.navigation.NavController navController;
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private static final java.util.Set<java.lang.Integer> TOP_LEVEL_DESTINATIONS = null;
    public static final com.crypto.ticker.ui.home.HomeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.crypto.ticker.ui.home.HomeActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void registerToolbarWithNavigation(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    public HomeActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/crypto/ticker/ui/home/HomeActivity$Companion;", "", "()V", "TOP_LEVEL_DESTINATIONS", "", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}