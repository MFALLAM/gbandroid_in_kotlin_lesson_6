package com.example.gblesson4.model.apikey

import com.google.gson.annotations.SerializedName

data class WeatherDTO(
    val fact: FactDTO,
//    пока не нужно
//    val info: InfoDTO,
//    val forecast: ForecastDTO,
//    val now: Int,
//    @SerializedName("now_dt")
//    val nowDt: String
)