package com.crypto.ticker.data.repository.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/crypto/ticker/data/repository/favorites/FavoritesDataSource;", "", "db", "Lcom/crypto/ticker/data/local/database/CoinsDatabase;", "(Lcom/crypto/ticker/data/local/database/CoinsDatabase;)V", "favoriteCoins", "Landroidx/lifecycle/LiveData;", "", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "getFavoriteCoins", "()Landroidx/lifecycle/LiveData;", "favouriteSymbols", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavouriteStatus", "symbol", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FavoritesDataSource {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> favoriteCoins = null;
    private final com.crypto.ticker.data.local.database.CoinsDatabase db = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> getFavoriteCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object favouriteSymbols(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateFavouriteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crypto.ticker.data.local.database.CoinsListEntity> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public FavoritesDataSource(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.local.database.CoinsDatabase db) {
        super();
    }
}