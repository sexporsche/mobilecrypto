package com.crypto.ticker.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/crypto/ticker/api/EndPoints;", "", "()V", "COINS", "", "COINS_LIST", "app_debug"})
public final class EndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COINS_LIST = "coins/markets";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COINS = "coins/{id}/market_chart";
    public static final com.crypto.ticker.api.EndPoints INSTANCE = null;
    
    private EndPoints() {
        super();
    }
}