package com.crypto.ticker.data.local.prefs;

import java.lang.System;

/**
 * [SharedPreferenceStorage] manages the preference for the app.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00108V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lcom/crypto/ticker/data/local/prefs/SharedPreferenceStorage;", "Lcom/crypto/ticker/data/local/prefs/PreferenceStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "", "isDarkMode", "()Z", "setDarkMode", "(Z)V", "isDarkMode$delegate", "Lcom/crypto/ticker/data/local/prefs/BooleanPreference;", "prefs", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "", "timeLoadedAt", "getTimeLoadedAt", "()J", "setTimeLoadedAt", "(J)V", "timeLoadedAt$delegate", "Lcom/crypto/ticker/data/local/prefs/LongPreference;", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class SharedPreferenceStorage implements com.crypto.ticker.data.local.prefs.PreferenceStorage {
    private final kotlin.Lazy<android.content.SharedPreferences> prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crypto.ticker.data.local.prefs.LongPreference timeLoadedAt$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crypto.ticker.data.local.prefs.BooleanPreference isDarkMode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_NAME = "com.crypto.ticker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_TIME_LOADED_AT = "prefs_data_loaded_at";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_IS_DARK_MODE = "prefs_is_dark_mode";
    public static final com.crypto.ticker.data.local.prefs.SharedPreferenceStorage.Companion Companion = null;
    
    @java.lang.Override()
    public long getTimeLoadedAt() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setTimeLoadedAt(long p0) {
    }
    
    @java.lang.Override()
    public boolean isDarkMode() {
        return false;
    }
    
    @java.lang.Override()
    public void setDarkMode(boolean p0) {
    }
    
    @javax.inject.Inject()
    public SharedPreferenceStorage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/crypto/ticker/data/local/prefs/SharedPreferenceStorage$Companion;", "", "()V", "PREFS_IS_DARK_MODE", "", "PREFS_NAME", "PREFS_TIME_LOADED_AT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}