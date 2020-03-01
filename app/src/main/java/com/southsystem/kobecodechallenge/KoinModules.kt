package com.southsystem.kobecodechallenge

import com.southsystem.kobecodechallenge.datasource.MovieRemoteDataSource
import com.southsystem.kobecodechallenge.repository.MovieRepository
import com.southsystem.kobecodechallenge.service.MovieService
import com.southsystem.kobecodechallenge.util.getApi
import com.southsystem.kobecodechallenge.viewmodel.MoviesListViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val movieModule = module {

    factory { getApi(MovieService::class.java) }

    factory { MovieRemoteDataSource(get()) }

    factory { MovieRepository(get()) }

    viewModel {
        MoviesListViewModel(get(), Dispatchers.IO)
    }
}