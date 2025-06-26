package com.crypto.ticker.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/crypto/ticker/adapters/CoinsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crypto/ticker/adapters/CoinsListAdapter$CoinsListViewHolder;", "onItemClickCallback", "Lcom/crypto/ticker/adapters/OnItemClickCallback;", "(Lcom/crypto/ticker/adapters/OnItemClickCallback;)V", "coinsList", "Ljava/util/ArrayList;", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "list", "", "CoinsListViewHolder", "app_debug"})
public final class CoinsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crypto.ticker.adapters.CoinsListAdapter.CoinsListViewHolder> {
    private final java.util.ArrayList<com.crypto.ticker.data.local.database.CoinsListEntity> coinsList = null;
    private final com.crypto.ticker.adapters.OnItemClickCallback onItemClickCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crypto.ticker.adapters.CoinsListAdapter.CoinsListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.adapters.CoinsListAdapter.CoinsListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crypto.ticker.data.local.database.CoinsListEntity> list) {
    }
    
    public CoinsListAdapter(@org.jetbrains.annotations.NotNull()
    com.crypto.ticker.adapters.OnItemClickCallback onItemClickCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/crypto/ticker/adapters/CoinsListAdapter$CoinsListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "model", "Lcom/crypto/ticker/data/local/database/CoinsListEntity;", "onItemClickCallback", "Lcom/crypto/ticker/adapters/OnItemClickCallback;", "app_debug"})
    public static final class CoinsListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.crypto.ticker.data.local.database.CoinsListEntity model, @org.jetbrains.annotations.NotNull()
        com.crypto.ticker.adapters.OnItemClickCallback onItemClickCallback) {
        }
        
        public CoinsListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}