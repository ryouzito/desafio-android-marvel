package com.example.marvel.application.domain.repository

import com.example.marvel.application.domain.model.Character

interface CharacterRepository {

    suspend fun characters(): Character

    suspend fun magazines()
}