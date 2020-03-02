package com.southsystem.kobecodechallenge.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/southsystem/kobecodechallenge/view/adapter/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/Filterable;", "moviesList", "", "Lcom/southsystem/kobecodechallenge/movie/model/Movie;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "filteredMovies", "", "getFilteredMovies", "()Ljava/util/List;", "setFilteredMovies", "(Ljava/util/List;)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieItemViewHolder", "app_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> filteredMovies;
    private java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> moviesList;
    private final kotlin.jvm.functions.Function1<com.southsystem.kobecodechallenge.movie.model.Movie, kotlin.Unit> listener = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> getFilteredMovies() {
        return null;
    }
    
    public final void setFilteredMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> moviesList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.southsystem.kobecodechallenge.movie.model.Movie, kotlin.Unit> listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/southsystem/kobecodechallenge/view/adapter/MoviesAdapter$MovieItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/southsystem/kobecodechallenge/databinding/MovieListItemBinding;", "listener", "Lkotlin/Function1;", "Lcom/southsystem/kobecodechallenge/movie/model/Movie;", "", "(Lcom/southsystem/kobecodechallenge/databinding/MovieListItemBinding;Lkotlin/jvm/functions/Function1;)V", "onBind", "item", "app_debug"})
    public static final class MovieItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.southsystem.kobecodechallenge.databinding.MovieListItemBinding binding = null;
        private final kotlin.jvm.functions.Function1<com.southsystem.kobecodechallenge.movie.model.Movie, kotlin.Unit> listener = null;
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.southsystem.kobecodechallenge.movie.model.Movie item) {
        }
        
        public MovieItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.southsystem.kobecodechallenge.databinding.MovieListItemBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.southsystem.kobecodechallenge.movie.model.Movie, kotlin.Unit> listener) {
            super(null);
        }
    }
}