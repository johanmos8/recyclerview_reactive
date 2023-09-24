package com.example.data.repository

import com.example.data.mapper.toDomain
import com.example.data.networking.ApiService
import com.example.domain.model.Movie
import com.example.domain.repository.MovieRepository
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : MovieRepository {
    override suspend fun getLatestMovies(): Flow<Resource<List<Movie>>> {
        return flow {
            emit(Resource.loading())
            try {
                val response = apiService.getLatestMovies()
                if (response.isSuccessful) {
                    response.body()?.result?.map { it.toDomain() }?.let {
                        emit(Resource.success(it))
                    }
                } else {
                    emit(Resource.success(emptyList()))
                }
            } catch (e: Throwable) {
                emit(Resource.error("An error ocurred", null))
            }
        }
    }
}