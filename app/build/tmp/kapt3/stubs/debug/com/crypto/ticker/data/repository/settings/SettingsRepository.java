package com.crypto.ticker.data.repository.settings;

import java.lang.System;

/**
 * [SettingsRepository] is to manage preference for dark mode option
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/crypto/ticker/data/repository/settings/SettingsRepository;", "", "preferenceStorage", "Lcom/crypto/ticker/data/local/prefs/PreferenceStorage;", "(Lcom/crypto/ticker/data/local/prefs/PreferenceStorage;)V", "isDarkModeEnabled", "", "setThemeMode", "", "isDarkMode", "app_debug"})
public final class SettingsRepository {
    private final com.crypto.ticker.data.local.prefs.PreferenceStorage preferenceStorage = null;
    
    public final boolean isDarkModeEnabled() {
        return false;
    }
    
    public final void setThemeMode(boolean isDarkMode) {
    }
    
    @javax.inject.Inject()
    public SettingsRepository(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.local.prefs.PreferenceStorage preferenceStorage) {
        super();
    }
}