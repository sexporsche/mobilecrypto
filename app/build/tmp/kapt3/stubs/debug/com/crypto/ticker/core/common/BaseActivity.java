package com.crypto.ticker.core.common;

import java.lang.System;

/**
 * [BaseActivity] contains common methods and properties and all activities must extend this class
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/crypto/ticker/core/common/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "showToast", "", "message", "", "duration", "", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    public BaseActivity() {
        super();
    }
}