package com.example.data.networking.model

import com.google.gson.annotations.SerializedName

data class MovieMainResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val result: List<MovieResponse>
)
