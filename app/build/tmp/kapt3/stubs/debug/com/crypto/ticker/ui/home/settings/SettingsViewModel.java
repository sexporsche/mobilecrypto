package com.crypto.ticker.ui.home.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0007R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/crypto/ticker/ui/home/settings/SettingsViewModel;", "Lcom/crypto/ticker/core/common/BaseViewModel;", "repository", "Lcom/crypto/ticker/data/repository/settings/SettingsRepository;", "(Lcom/crypto/ticker/data/repository/settings/SettingsRepository;)V", "_isDarkMode", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "isDarkMode", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "onThemeChanged", "", "app_debug"})
public final class SettingsViewModel extends com.crypto.ticker.core.common.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isDarkMode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isDarkMode = null;
    private final com.crypto.ticker.data.repository.settings.SettingsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isDarkMode() {
        return null;
    }
    
    public final void onThemeChanged(boolean isDarkMode) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.settings.SettingsRepository repository) {
        super();
    }
}