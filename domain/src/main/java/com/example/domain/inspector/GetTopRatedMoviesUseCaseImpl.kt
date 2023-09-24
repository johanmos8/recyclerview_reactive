package com.example.domain.inspector

import com.example.domain.repository.MovieRepository
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetTopRatedMoviesUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : GetTopRatedMoviesUseCase {
    override suspend operator fun invoke()= flow{
        emitAll(movieRepository.getTopRatedMovies())
    }
}