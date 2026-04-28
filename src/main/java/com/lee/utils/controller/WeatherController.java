package com.lee.utils.controller;

import com.lee.utils.dto.Result;
import com.lee.utils.dto.weather.WeatherResp;
import com.lee.utils.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WeatherController {

    private final WeatherService weatherService;
    WeatherResp weatherResp;


    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/weather")
    public Result<WeatherResp> weather(String lat, String lon) {
        try{

            if(lat == null || lon == null){
                weatherResp = this.weatherService.getWeather();
            }
            else{
                weatherResp = this.weatherService.getWeather(lat, lon);
            }

            return Result.success(weatherResp);

        }
        catch (Exception e){
            log.error("获取天气失败", e);
            return Result.error("获取天气失败");
        }

    }
}
