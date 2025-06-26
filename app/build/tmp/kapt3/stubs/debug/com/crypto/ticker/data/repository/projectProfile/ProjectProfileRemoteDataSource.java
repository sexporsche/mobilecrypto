package com.crypto.ticker.data.repository.projectProfile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileRemoteDataSource;", "Lcom/crypto/ticker/api/BaseRemoteDataSource;", "service", "Lcom/crypto/ticker/api/ApiInterface;", "(Lcom/crypto/ticker/api/ApiInterface;)V", "historicalPrice", "Lcom/crypto/ticker/api/Result;", "Lcom/crypto/ticker/api/models/HistoricalPriceResponse;", "symbol", "", "targetCurrency", "days", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProjectProfileRemoteDataSource extends com.crypto.ticker.api.BaseRemoteDataSource {
    private final com.crypto.ticker.api.ApiInterface service = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object historicalPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    java.lang.String targetCurrency, int days, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crypto.ticker.api.Result<com.crypto.ticker.api.models.HistoricalPriceResponse>> p3) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProjectProfileRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.api.ApiInterface service) {
        super();
    }
}