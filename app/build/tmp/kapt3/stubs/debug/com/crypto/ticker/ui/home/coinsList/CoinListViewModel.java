package com.crypto.ticker.ui.home.coinsList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/crypto/ticker/ui/home/coinsList/CoinListViewModel;", "Lcom/crypto/ticker/core/common/BaseViewModel;", "repository", "Lcom/crypto/ticker/data/repository/coinsList/CoinsListRepository;", "(Lcom/crypto/ticker/data/repository/coinsList/CoinsListRepository;)V", "_favouriteStock", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "coinsListData", "Landroidx/lifecycle/LiveData;", "", "getCoinsListData", "()Landroidx/lifecycle/LiveData;", "favouriteStock", "getFavouriteStock", "isListEmpty", "", "loadCoinsFromApi", "", "targetCur", "", "updateFavouriteStatus", "symbol", "app_debug"})
public final class CoinListViewModel extends com.crypto.ticker.core.common.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> coinsListData = null;
    private final androidx.lifecycle.MutableLiveData<com.crypto.ticker.data.local.database.CoinsListEntity> _favouriteStock = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> favouriteStock = null;
    private final com.crypto.ticker.data.repository.coinsList.CoinsListRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity>> getCoinsListData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> getFavouriteStock() {
        return null;
    }
    
    public final boolean isListEmpty() {
        return false;
    }
    
    public final void loadCoinsFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String targetCur) {
    }
    
    public final void updateFavouriteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public CoinListViewModel(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.coinsList.CoinsListRepository repository) {
        super();
    }
}