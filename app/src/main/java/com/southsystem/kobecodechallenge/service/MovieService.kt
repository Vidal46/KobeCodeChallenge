package com.southsystem.kobecodechallenge.service

import com.southsystem.kobecodechallenge.model.MovieDetail
import com.southsystem.kobecodechallenge.model.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @Headers("Accept: application/json", "Content-Type: application/json")
    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("page") page: Int,
        @Query("language") language: String
    ): MoviesResponse

    @Headers("Accept: application/json", "Content-Type: application/json")
    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int
    ): MovieDetail
}