package com.crypto.ticker.data.repository.coinsList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/crypto/ticker/data/repository/coinsList/CoinsListRemoteDataSource;", "Lcom/crypto/ticker/api/BaseRemoteDataSource;", "service", "Lcom/crypto/ticker/api/ApiInterface;", "(Lcom/crypto/ticker/api/ApiInterface;)V", "coinsList", "Lcom/crypto/ticker/api/Result;", "", "Lcom/crypto/ticker/api/models/Coin;", "targetCur", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CoinsListRemoteDataSource extends com.crypto.ticker.api.BaseRemoteDataSource {
    private final com.crypto.ticker.api.ApiInterface service = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object coinsList(@org.jetbrains.annotations.NotNull()
    java.lang.String targetCur, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crypto.ticker.api.Result<? extends java.util.List<com.crypto.ticker.api.models.Coin>>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public CoinsListRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.api.ApiInterface service) {
        super();
    }
}