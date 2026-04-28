package com.lee.utils.feign;

import com.lee.utils.dto.weather.WeatherResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
    name = "openWeather",
    url = "https://api.openweathermap.org" // 第三方根地址
)

public interface OpenweatherFeignClient {
    @GetMapping("/data/3.0/onecall")
    WeatherResp getWeather(
            @RequestParam("lat") String lat,
            @RequestParam("lon") String lon,
            @RequestParam("appid") String appid
    );
}
