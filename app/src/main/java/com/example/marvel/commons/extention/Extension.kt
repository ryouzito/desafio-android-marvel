package com.example.marvel.commons.extention

const val EMPTY_STRING = ""
const val ZERO_LONG = 0L
const val ZERO_DOUBLE = 0.0
const val ZERO = 0

fun Double?.orZero() = this ?: ZERO_DOUBLE
fun Int?.orZero() = this ?: ZERO
fun Long?.orZero() = this ?: ZERO_LONG