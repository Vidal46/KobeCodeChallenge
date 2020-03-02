package com.southsystem.kobecodechallenge.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MovieDetail(
    @SerializedName("poster_path") var poster: String?,
    @SerializedName("title") var title: String?,
    @SerializedName("overview") var overview: String?,
    @SerializedName("release_date") var releaseDate: String?,
    @SerializedName("genres") var genres: MutableList<Genre>?
) : Serializable