package com.southsystem.kobecodechallenge.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/southsystem/kobecodechallenge/datasource/MovieRemoteDataSource;", "", "service", "Lcom/southsystem/kobecodechallenge/service/MovieService;", "(Lcom/southsystem/kobecodechallenge/service/MovieService;)V", "getMovieDetails", "Lcom/southsystem/kobecodechallenge/model/MovieDetail;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lcom/southsystem/kobecodechallenge/model/MoviesResponse;", "page", "app_debug"})
public final class MovieRemoteDataSource {
    private final com.southsystem.kobecodechallenge.service.MovieService service = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPopularMovies(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.southsystem.kobecodechallenge.model.MoviesResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieDetails(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.southsystem.kobecodechallenge.model.MovieDetail> p1) {
        return null;
    }
    
    public MovieRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.southsystem.kobecodechallenge.service.MovieService service) {
        super();
    }
}