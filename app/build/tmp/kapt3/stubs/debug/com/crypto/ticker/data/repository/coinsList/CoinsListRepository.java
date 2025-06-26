package com.crypto.ticker.data.repository.coinsList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/crypto/ticker/data/repository/coinsList/CoinsListRepository;", "", "coinsListRemoteDataSource", "Lcom/crypto/ticker/data/repository/coinsList/CoinsListRemoteDataSource;", "coinsListDataSource", "Lcom/crypto/ticker/data/repository/coinsList/CoinsListDataSource;", "preferenceStorage", "Lcom/crypto/ticker/data/local/prefs/PreferenceStorage;", "(Lcom/crypto/ticker/data/repository/coinsList/CoinsListRemoteDataSource;Lcom/crypto/ticker/data/repository/coinsList/CoinsListDataSource;Lcom/crypto/ticker/data/local/prefs/PreferenceStorage;)V", "allCoinsLD", "Landroidx/lifecycle/LiveData;", "", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "getAllCoinsLD", "()Landroidx/lifecycle/LiveData;", "coinsList", "", "targetCur", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "", "updateFavouriteStatus", "Lcom/crypto/ticker/api/Result;", "symbol", "app_debug"})
public final class CoinsListRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> allCoinsLD = null;
    private final com.crypto.ticker.data.repository.coinsList.CoinsListRemoteDataSource coinsListRemoteDataSource = null;
    private final com.crypto.ticker.data.repository.coinsList.CoinsListDataSource coinsListDataSource = null;
    private final com.crypto.ticker.data.local.prefs.PreferenceStorage preferenceStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> getAllCoinsLD() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object coinsList(@org.jetbrains.annotations.NotNull()
    java.lang.String targetCur, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateFavouriteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crypto.ticker.api.Result<com.crypto.ticker.data.local.database.CoinsListEntity>> p1) {
        return null;
    }
    
    public final boolean loadData() {
        return false;
    }
    
    @javax.inject.Inject()
    public CoinsListRepository(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.coinsList.CoinsListRemoteDataSource coinsListRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.coinsList.CoinsListDataSource coinsListDataSource, @org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.local.prefs.PreferenceStorage preferenceStorage) {
        super();
    }
}