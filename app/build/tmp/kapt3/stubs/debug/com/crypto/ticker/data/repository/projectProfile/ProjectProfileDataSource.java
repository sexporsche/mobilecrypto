package com.crypto.ticker.data.repository.projectProfile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/crypto/ticker/data/repository/projectProfile/ProjectProfileDataSource;", "", "db", "Lcom/crypto/ticker/data/local/database/CoinsDatabase;", "(Lcom/crypto/ticker/data/local/database/CoinsDatabase;)V", "projectBySymbol", "Landroidx/lifecycle/LiveData;", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "symbol", "", "app_debug"})
public final class ProjectProfileDataSource {
    private final com.crypto.ticker.data.local.database.CoinsDatabase db = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crypto.ticker.data.local.database.CoinsListEntity> projectBySymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProjectProfileDataSource(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.data.local.database.CoinsDatabase db) {
        super();
    }
}