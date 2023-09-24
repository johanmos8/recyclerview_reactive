package com.example.domain.di

import com.example.domain.inspector.GetLatestMoviesUseCase
import com.example.domain.inspector.GetLatestMoviesUseCaseImpl
import com.example.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object InteractionModule {
    @Provides
    fun provideGetTvShowsUseCase(
        movieRepository: MovieRepository
    ): GetLatestMoviesUseCase = GetLatestMoviesUseCaseImpl(movieRepository)

}