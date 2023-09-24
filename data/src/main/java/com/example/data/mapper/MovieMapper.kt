package com.example.data.mapper

import com.example.data.networking.model.GenreResponse
import com.example.data.networking.model.MovieResponse
import com.example.domain.model.Genre
import com.example.domain.model.Movie


fun MovieResponse.toDomain() = Movie(
    adult = adult,
    backdropPath = backdropPath,
    genres = genres.map { it ->
        Genre(
            id = it.id,
            name = it.name
        )
    },
    homepage = homepage,
    id = id,
    imdbId = imdbId,
    originalLanguage = originalLanguage,
    originalTitle = originalTitle,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath,
    title = title,
    video = video,
    voteAverage = voteAverage,
    voteCount = voteCount
)

