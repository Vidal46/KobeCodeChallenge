package com.southsystem.kobecodechallenge.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u000bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/southsystem/kobecodechallenge/viewmodel/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/southsystem/kobecodechallenge/repository/MovieRepository;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/southsystem/kobecodechallenge/repository/MovieRepository;Lkotlin/coroutines/CoroutineContext;)V", "_details", "Landroidx/lifecycle/MutableLiveData;", "Lcom/southsystem/kobecodechallenge/model/MovieDetail;", "_error", "", "_isLoading", "", "details", "Landroidx/lifecycle/LiveData;", "getDetails", "()Landroidx/lifecycle/LiveData;", "error", "getError", "isLoading", "getMovieDetails", "", "movieId", "", "getParsedGenres", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.southsystem.kobecodechallenge.model.MovieDetail> _details = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    private final com.southsystem.kobecodechallenge.repository.MovieRepository repository = null;
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.southsystem.kobecodechallenge.model.MovieDetail> getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void getMovieDetails(int movieId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParsedGenres() {
        return null;
    }
    
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.southsystem.kobecodechallenge.repository.MovieRepository repository, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext) {
        super();
    }
}