package com.lee.utils.dto.weather;

import lombok.Data;

import java.util.List;

@Data
public class WeatherResp {
    private Double lat;
    private Double lon;
    private String timezone;
    private Integer timezone_offset;
    private Current current;
    @Data
    public static class Current {
        private Long dt;
        private Long sunrise;
        private Long sunset;
        private Double temp;
        private Double feels_like;
        private Integer pressure;
        private Integer humidity;
        private Double dew_point;
        private Double uvi;
        private Integer clouds;
        private Integer visibility;
        private Integer wind_speed;
        private Integer wind_deg;
        private Double wind_gust;
        private List<Weather> weather;
         @Data
        public static class Weather {
            private Integer id;
            private String main;
            private String description;
            private String icon;
        }
    }
}
