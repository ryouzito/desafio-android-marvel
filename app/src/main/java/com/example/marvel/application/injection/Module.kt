package com.example.marvel.application.injection

import com.example.marvel.application.data.api.CharacterApi
import com.example.marvel.application.data.repository.CharacterRepositoryImpl
import com.example.marvel.application.domain.repository.CharacterRepository
import com.example.marvel.coreapi.retrofit
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val apiModule = module { factory<CharacterApi> { retrofit().create(CharacterApi::class.java) } }
val repositoryModule =
    module {
        factory<CharacterRepository> {
            CharacterRepositoryImpl(
                context = androidContext(),
                characterApi = get()
            )
        }
    }