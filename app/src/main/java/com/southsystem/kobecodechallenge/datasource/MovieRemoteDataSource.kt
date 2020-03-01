package com.southsystem.kobecodechallenge.datasource

import com.southsystem.kobecodechallenge.model.Genre
import com.southsystem.kobecodechallenge.movie.model.Movie
import com.southsystem.kobecodechallenge.service.MovieService

const val KEY = "c5850ed73901b8d268d0898a8a9d8bff"

class MovieRemoteDataSource(private val service: MovieService) {

    suspend fun getPopularMovies(offset: Int): List<Movie> {
        return service.getPopularMovies(KEY)
    }

    suspend fun getMovieDetails(movieId: Int): Movie {
        return service.getMovieDetails(KEY, movieId)
    }

    suspend fun getGenres(): List<Genre> {
        return service.getGenres(KEY)
    }
}