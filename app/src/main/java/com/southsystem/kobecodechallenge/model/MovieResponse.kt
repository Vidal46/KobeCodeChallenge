package com.southsystem.kobecodechallenge.model

import com.google.gson.annotations.SerializedName

data class MovieResponse<T>(
    @SerializedName("code") val code: Int,
    @SerializedName("data") val data: Data<T>
) {
    class Data<T>(
        @SerializedName("results") val results: List<T>
    )
}