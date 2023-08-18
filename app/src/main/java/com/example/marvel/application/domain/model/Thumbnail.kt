package com.example.marvel.application.domain.model

import com.example.marvel.commons.extention.EMPTY_STRING

data class Thumbnail(
    var path: String = EMPTY_STRING,
    var extension: String = EMPTY_STRING
)
