package com.crypto.ticker.data.repository.projectProfile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileRepository;", "", "localDataSource", "Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileDataSource;", "remoteDataSource", "Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileRemoteDataSource;", "(Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileDataSource;Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileRemoteDataSource;)V", "historicalPrice", "Lcom/crypto/ticker/api/Result;", "Lcom/crypto/ticker/api/models/HistoricalPriceResponse;", "symbol", "", "targetCur", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "projectBySymbol", "Landroidx/lifecycle/LiveData;", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "app_debug"})
public final class ProjectProfileRepository {
    private final com.crypto.ticker.data.repository.projectProfile.ProjectProfileDataSource localDataSource = null;
    private final com.crypto.ticker.data.repository.projectProfile.ProjectProfileRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> projectBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object historicalPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    java.lang.String targetCur, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crypto.ticker.api.Result<com.crypto.ticker.api.models.HistoricalPriceResponse>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProjectProfileRepository(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.projectProfile.ProjectProfileDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.projectProfile.ProjectProfileRemoteDataSource remoteDataSource) {
        super();
    }
}