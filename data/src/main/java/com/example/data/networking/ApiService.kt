package com.example.data.networking

import com.example.data.networking.model.MovieMainResponse
import retrofit2.Response
import retrofit2.http.GET


const val API_KEY = "d0a74ccef77eef8beb6d955d4518eb09"

interface ApiService {

    @GET("/movie/latest?api_key=${API_KEY}")
    suspend fun getTopRatedMovies(): Response<MovieMainResponse>
}