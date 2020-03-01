package com.southsystem.kobecodechallenge.service

import com.southsystem.kobecodechallenge.model.Genre
import com.southsystem.kobecodechallenge.movie.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {


    @Headers("Accept: application/json", "Content-Type: application/json")
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String
    ): List<Movie>

    @Headers("Accept: application/json", "Content-Type: application/json")
    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Query("api_key") apiKey: String,
        @Path("movie_id") movieId: Int
    ): Movie

    @Headers("Accept: application/json", "Content-Type: application/json")
    @GET("genre/movie/list")
    suspend fun getGenres(
        @Query("api_key") apiKey: String
    ) : List<Genre>
}