package service;

import model.Location;
import model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataService {
    WeatherData getWeatherDataById(UUID id);

    List<WeatherData> getWeatherDataForLocation(Location location);

    void addWeatherData(WeatherData weatherData);

    void updateWeatherData(WeatherData weatherData);

    void deleteWeatherData(WeatherData weatherData);
}
