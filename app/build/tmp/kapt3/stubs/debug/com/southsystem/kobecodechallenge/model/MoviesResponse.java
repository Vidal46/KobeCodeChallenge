package com.southsystem.kobecodechallenge.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/southsystem/kobecodechallenge/model/MoviesResponse;", "", "movies", "", "Lcom/southsystem/kobecodechallenge/movie/model/Movie;", "totalPages", "", "currentPage", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurrentPage", "()Ljava/lang/Integer;", "setCurrentPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMovies", "()Ljava/util/List;", "setMovies", "(Ljava/util/List;)V", "getTotalPages", "setTotalPages", "app_debug"})
public final class MoviesResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> movies;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private java.lang.Integer totalPages;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "page")
    private java.lang.Integer currentPage;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> getMovies() {
        return null;
    }
    
    public final void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    public final void setTotalPages(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrentPage() {
        return null;
    }
    
    public final void setCurrentPage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public MoviesResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.southsystem.kobecodechallenge.movie.model.Movie> movies, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer currentPage) {
        super();
    }
    
    public MoviesResponse() {
        super();
    }
}