package com.southsystem.kobecodechallenge.repository

import com.southsystem.kobecodechallenge.datasource.MovieRemoteDataSource
import com.southsystem.kobecodechallenge.model.Genre
import com.southsystem.kobecodechallenge.model.MovieDetail
import com.southsystem.kobecodechallenge.model.MoviesResponse
import com.southsystem.kobecodechallenge.movie.model.Movie

class MovieRepository(private val dataSource: MovieRemoteDataSource) {

    suspend fun getUpcomingMovies(page: Int): MoviesResponse {
        return dataSource.getUpcomingMovies(page)
    }

    suspend fun getMovieDetails(movieId: Int): MovieDetail {
        return dataSource.getMovieDetails(movieId)
    }
}