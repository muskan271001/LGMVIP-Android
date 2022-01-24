package com.example.covid

data class Model (
    val cityName: String ,
    val activeCase: Int ,
    val totalCase: Int ,
    val deathCase: Int ,
    val recCase: Int =0
    )

