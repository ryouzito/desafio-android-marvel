package com.example.marvel.commons.extention

const val EMPTY_STRING = ""
const val ZERO_LONG = 0L
const val ZERO = 0

fun Int?.orZero() = this ?: ZERO

fun Long?.orZero() = this ?: ZERO_LONG