package com.example.domain.inspector

import com.example.domain.repository.MovieRepository
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetLatestMoviesUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : GetLatestMoviesUseCase {
    override suspend operator fun invoke()= flow{
        emitAll(movieRepository.getLatestMovies())
    }
}