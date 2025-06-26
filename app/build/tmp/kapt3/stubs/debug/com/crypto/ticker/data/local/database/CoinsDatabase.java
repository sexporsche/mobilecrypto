package com.crypto.ticker.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {com.crypto.ticker.data.local.database.CoinsListEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crypto/ticker/data/local/database/CoinsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "coinsListDao", "Lcom/crypto/ticker/data/local/database/CoinsListDao;", "Companion", "app_debug"})
public abstract class CoinsDatabase extends androidx.room.RoomDatabase {
    public static final com.crypto.ticker.data.local.database.CoinsDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crypto.ticker.data.local.database.CoinsListDao coinsListDao();
    
    public CoinsDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/crypto/ticker/data/local/database/CoinsDatabase$Companion;", "", "()V", "buildDatabase", "Lcom/crypto/ticker/data/local/database/CoinsDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.crypto.ticker.data.local.database.CoinsDatabase buildDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}