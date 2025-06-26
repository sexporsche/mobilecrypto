package com.crypto.ticker.ui.home.favoruites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/crypto/ticker/ui/home/favoruites/FavoritesViewModel;", "Lcom/crypto/ticker/core/common/BaseViewModel;", "repository", "Lcom/crypto/ticker/data/repository/favorites/FavoritesRepository;", "(Lcom/crypto/ticker/data/repository/favorites/FavoritesRepository;)V", "_favouriteStock", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "_favouritesEmpty", "", "favoriteCoinsList", "Landroidx/lifecycle/LiveData;", "", "getFavoriteCoinsList", "()Landroidx/lifecycle/LiveData;", "favouriteStock", "getFavouriteStock", "favouritesEmpty", "getFavouritesEmpty", "isFavouritesEmpty", "", "empty", "updateFavouriteStatus", "symbol", "", "app_debug"})
public final class FavoritesViewModel extends com.crypto.ticker.core.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> favoriteCoinsList = null;
    private final androidx.lifecycle.MutableLiveData<com.crypto.ticker.data.local.database.CoinsListEntity> _favouriteStock = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> favouriteStock = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _favouritesEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> favouritesEmpty = null;
    private final com.crypto.ticker.data.repository.favorites.FavoritesRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> getFavoriteCoinsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> getFavouriteStock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getFavouritesEmpty() {
        return null;
    }
    
    public final void updateFavouriteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
    }
    
    public final void isFavouritesEmpty(boolean empty) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.favorites.FavoritesRepository repository) {
        super();
    }
}