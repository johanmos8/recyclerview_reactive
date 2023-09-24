package com.example.data.di

import com.example.data.networking.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

   /* @Singleton
    @Provides
    fun provideTvShowRepository(
        api: ApiService,
    ): TvShowRepository = TvShowRepositoryImpl(mubiApi)
*/
}