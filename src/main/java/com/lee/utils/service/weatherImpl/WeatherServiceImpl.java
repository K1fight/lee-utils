package com.lee.utils.service.weatherImpl;

import com.lee.utils.dto.weather.WeatherResp;
import com.lee.utils.feign.OpenweatherFeignClient;
import com.lee.utils.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherServiceImpl implements WeatherService {

    private final OpenweatherFeignClient weather;


    @Value("${openweather.api-key}")
    private String OPEN_WEATHER_API_KEY;

    @Value("${openweather.default-lat}")
    private String DEFAULT_LAT;

    @Value("${openweather.default-lon}")
    private String DEFAULT_LON;

    public WeatherServiceImpl(OpenweatherFeignClient weather) {
        this.weather = weather;
    }

    @Override
    public WeatherResp getWeather(String lat, String lon) {
        log.info("Start to process getWeather(with para) method");
        return weather.getWeather(
                lat,
                lon,
                OPEN_WEATHER_API_KEY
        );
    }
    public WeatherResp getWeather(){
        log.info("Start to process getWeather(without para) method");
        return weather.getWeather(
                DEFAULT_LAT,
                DEFAULT_LON,
                OPEN_WEATHER_API_KEY

        );
    }
}
