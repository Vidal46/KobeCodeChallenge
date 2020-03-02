package com.southsystem.kobecodechallenge.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/southsystem/kobecodechallenge/service/MovieService;", "", "getMovieDetails", "Lcom/southsystem/kobecodechallenge/model/MovieDetail;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lcom/southsystem/kobecodechallenge/model/MoviesResponse;", "page", "language", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/popular")
    @retrofit2.http.Headers(value = {"Accept: application/json", "Content-Type: application/json"})
    public abstract java.lang.Object getPopularMovies(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.southsystem.kobecodechallenge.model.MoviesResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    @retrofit2.http.Headers(value = {"Accept: application/json", "Content-Type: application/json"})
    public abstract java.lang.Object getMovieDetails(@retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.southsystem.kobecodechallenge.model.MovieDetail> p1);
}