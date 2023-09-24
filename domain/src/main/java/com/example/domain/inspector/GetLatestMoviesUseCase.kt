package com.example.domain.inspector

import com.example.domain.model.Movie
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow


interface GetLatestMoviesUseCase {
    suspend operator fun invoke(): Flow<Resource<List<Movie>>>
}