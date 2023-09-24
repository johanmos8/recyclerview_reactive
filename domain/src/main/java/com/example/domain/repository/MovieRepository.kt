package com.example.domain.repository

import com.example.domain.model.Movie
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    suspend fun getTopRatedMovies(): Flow<Resource<List<Movie>>>
}