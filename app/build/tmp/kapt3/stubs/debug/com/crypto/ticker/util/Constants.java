package com.crypto.ticker.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/crypto/ticker/util/Constants;", "", "()V", "BASE_URL", "", "EXTRA_SYMBOL", "EXTRA_SYMBOL_ID", "GENERIC_ERROR", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.coingecko.com/api/v3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENERIC_ERROR = "Something went wrong, try again!";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SYMBOL = "symbol";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SYMBOL_ID = "id";
    public static final com.crypto.ticker.util.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}