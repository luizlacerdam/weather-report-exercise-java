package com.betrybe.weatherreport.classes;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Não entendi.
 */
@Configuration
public class WeatherConfig {
  @Bean
  WeatherClient weatherClient() {
    return new WeatherClientClass();
  }
}