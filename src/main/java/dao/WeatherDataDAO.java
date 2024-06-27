package dao;

import model.Location;
import model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataDAO {
    WeatherData findById(UUID id);

    List<WeatherData> findByLocation(Location location);

    void save(WeatherData weatherData);

    void update(WeatherData weatherData);

    void delete(WeatherData weatherData);
}
