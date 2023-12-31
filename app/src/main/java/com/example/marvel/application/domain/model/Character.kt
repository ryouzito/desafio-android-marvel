package com.example.marvel.application.domain.model

import com.example.marvel.commons.extention.EMPTY_STRING
import com.example.marvel.commons.extention.ZERO

data class Character (
    var id: Int = ZERO,
    var name: String = EMPTY_STRING,
    var description: String = EMPTY_STRING,
    var thumbnail: Thumbnail = Thumbnail(),
    var prices: MutableList<Price> = ArrayList(),
    var title: String = EMPTY_STRING
)