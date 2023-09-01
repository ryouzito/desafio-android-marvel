package com.example.marvel.application.data.response

import com.example.marvel.application.domain.model.Price
import com.example.marvel.application.domain.model.Thumbnail
import com.example.marvel.commons.extention.EMPTY_STRING
import com.example.marvel.commons.extention.ZERO

class CharacterResponse (
    var id: Int = ZERO,
    var name: String = EMPTY_STRING,
    var description: String = EMPTY_STRING,
    var thumbnail: Thumbnail = Thumbnail(),
    var prices: MutableList<Price> = ArrayList(),
    var title: String = EMPTY_STRING
)