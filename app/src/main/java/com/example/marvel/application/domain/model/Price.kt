package com.example.marvel.application.domain.model

import com.example.marvel.commons.extention.EMPTY_STRING

data class Price(
    var price: Double = 0.0,
    var type: String = EMPTY_STRING
)
