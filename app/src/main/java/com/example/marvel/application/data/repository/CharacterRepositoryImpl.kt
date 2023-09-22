package com.example.marvel.application.data.repository

import android.content.Context
import com.example.marvel.application.data.api.CharacterApi
import com.example.marvel.application.domain.model.Character
import com.example.marvel.application.domain.repository.CharacterRepository

class CharacterRepositoryImpl(
    private val characterApi: CharacterApi,
    private val context: Context
) : CharacterRepository {
    override suspend fun characters(): Character {
        TODO("Not yet implemented")
    }

    override suspend fun magazines() {
        TODO("Not yet implemented")
    }
}