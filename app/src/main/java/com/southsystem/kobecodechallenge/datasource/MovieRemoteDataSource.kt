package com.southsystem.kobecodechallenge.datasource

import com.southsystem.kobecodechallenge.model.MovieDetail
import com.southsystem.kobecodechallenge.model.MoviesResponse
import com.southsystem.kobecodechallenge.service.MovieService

class MovieRemoteDataSource(private val service: MovieService) {

    suspend fun getUpcomingMovies(page: Int): MoviesResponse {
        return service.getUpcomingMovies(page, "en")
    }

    suspend fun getMovieDetails(movieId: Int): MovieDetail {
        return service.getMovieDetails(movieId)
    }
}