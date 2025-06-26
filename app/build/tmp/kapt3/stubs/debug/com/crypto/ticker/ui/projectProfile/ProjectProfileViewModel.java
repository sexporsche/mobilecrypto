package com.crypto.ticker.ui.projectProfile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/crypto/ticker/ui/projectProfile/ProjectProfileViewModel;", "Lcom/crypto/ticker/core/common/BaseViewModel;", "repository", "Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileRepository;", "(Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileRepository;)V", "_dataError", "Landroidx/lifecycle/MutableLiveData;", "", "_historicalData", "", "", "dataError", "Landroidx/lifecycle/LiveData;", "getDataError", "()Landroidx/lifecycle/LiveData;", "historicalData", "getHistoricalData", "", "symbol", "", "projectBySymbol", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "app_debug"})
public final class ProjectProfileViewModel extends com.crypto.ticker.core.common.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> dataError = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<double[]>> _historicalData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<double[]>> historicalData = null;
    private final com.crypto.ticker.data.repository.projectProfile.ProjectProfileRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> projectBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<double[]>> getHistoricalData() {
        return null;
    }
    
    public final void historicalData(@org.jetbrains.annotations.Nullable()
    java.lang.String symbol) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ProjectProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.repository.projectProfile.ProjectProfileRepository repository) {
        super();
    }
}