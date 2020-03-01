package com.southsystem.kobecodechallenge.repository

import com.southsystem.kobecodechallenge.datasource.MovieRemoteDataSource
import com.southsystem.kobecodechallenge.model.Genre
import com.southsystem.kobecodechallenge.movie.model.Movie

class MovieRepository(private val dataSource: MovieRemoteDataSource) {

    suspend fun getPopularMovies(offset: Int): List<Movie> {
        return dataSource.getPopularMovies(offset)
    }

    suspend fun getMovieDetails(movieId: Int): Movie {
        return dataSource.getMovieDetails(movieId)
    }

    suspend fun getGenres(): List<Genre> {
        return dataSource.getGenres()
    }
}