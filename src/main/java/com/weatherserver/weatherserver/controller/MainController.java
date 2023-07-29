package com.weatherserver.weatherserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.weatherserver.weatherserver.model.WeatherData;

@CrossOrigin
@RestController
public class MainController {
    private final RestTemplate restTemplate = new RestTemplate();

    WeatherData weatherData = new WeatherData();

    @PostMapping("/")
    public String demo(@RequestParam String lat, @RequestParam String lan) {
        weatherData.getWeatherData(lan, lat);
        return weatherData.getWeatherData(lan, lat).toString();
    }

    @GetMapping("/")
    public String getMethodName() {
        System.out.println("test");
        return "hemanth";
    }

}
