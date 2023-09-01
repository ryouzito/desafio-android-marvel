package com.example.marvel.application.domain.model

import com.example.marvel.commons.extention.EMPTY_STRING
import com.example.marvel.commons.extention.ZERO_DOUBLE

data class Price(
    var price: Double = ZERO_DOUBLE,
    var type: String = EMPTY_STRING
)
