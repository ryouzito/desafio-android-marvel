package com.example.marvel.application.data.api

import com.example.marvel.application.data.response.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApi {

    @GET("v1/public/characters?")
    suspend fun get(
        @Query("ts") ts: Long,
        @Query("apiKey") apiKey: String
    ): CharacterResponse
}