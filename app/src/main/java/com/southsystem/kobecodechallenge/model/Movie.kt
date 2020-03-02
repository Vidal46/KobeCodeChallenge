package com.southsystem.kobecodechallenge.movie.model

import com.google.gson.annotations.SerializedName
import com.southsystem.kobecodechallenge.model.Genre
import java.io.Serializable

data class Movie(
    @SerializedName("id") val id: Int?,
    @SerializedName("title") val name: String?,
    @SerializedName("genre") val description: List<Genre>?,
    @SerializedName("poster_path") val poster: String?,
    @SerializedName("overview") val overview: String?
) : Serializable