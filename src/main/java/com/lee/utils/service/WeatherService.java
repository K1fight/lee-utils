package com.lee.utils.service;

import com.lee.utils.dto.weather.WeatherResp;

public interface WeatherService {
    WeatherResp getWeather(String lat, String lon);
    WeatherResp getWeather();
}
