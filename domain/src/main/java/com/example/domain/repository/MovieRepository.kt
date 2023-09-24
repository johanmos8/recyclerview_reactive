package com.example.domain.repository

import com.example.domain.model.Movie
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    suspend fun getLatestMovies(): Flow<Resource<List<Movie>>>
}