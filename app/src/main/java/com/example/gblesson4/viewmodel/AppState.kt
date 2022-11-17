package com.example.gblesson4.viewmodel
import com.example.gblesson4.model.Weather
import com.example.gblesson4.model.apikey.WeatherDTO

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class SuccessFromServer(val weatherDTO: WeatherDTO) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}