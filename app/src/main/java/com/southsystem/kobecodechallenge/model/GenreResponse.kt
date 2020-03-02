package com.southsystem.kobecodechallenge.model

import com.google.gson.annotations.SerializedName

data class GenresResponse(
    @SerializedName("genres")
    var genreList: List<Genre>
)