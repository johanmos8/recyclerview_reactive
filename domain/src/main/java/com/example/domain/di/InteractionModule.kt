package com.example.domain.di

import com.example.domain.inspector.GetTopRatedMoviesUseCase
import com.example.domain.inspector.GetTopRatedMoviesUseCaseImpl
import com.example.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object InteractionModule {
    @Provides
    fun provideGetTopRatedMoviesUseCase(
        movieRepository: MovieRepository
    ): GetTopRatedMoviesUseCase = GetTopRatedMoviesUseCaseImpl(movieRepository)

}