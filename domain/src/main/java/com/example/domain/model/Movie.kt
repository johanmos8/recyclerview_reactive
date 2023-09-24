package com.example.domain.model


data class Movie(
    val adult: Boolean,
    val backdropPath: String?,
    val genres: List<Genre>,
    val homepage: String,
    val id: Int,
    val imdbId: String?,
    val originalLanguage: String,
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String?,
    val title: String,
    val video: Boolean,
    val voteAverage: Double,
    val voteCount: Int
)
