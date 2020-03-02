package com.southsystem.kobecodechallenge.model

import com.google.gson.annotations.SerializedName
import com.southsystem.kobecodechallenge.movie.model.Movie

class MoviesResponse(

    @SerializedName("results")
    var movies: List<Movie> = listOf(),

    @SerializedName("total_pages")
    var totalPages: Int? = null,

    @SerializedName("page")
    var currentPage: Int? = null

)