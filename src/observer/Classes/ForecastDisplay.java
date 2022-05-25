package observer.Classes;

import observer.Interfaces.IDisplayElement;
import observer.Interfaces.IObserver;

import java.util.Map;

public class ForecastDisplay implements IObserver, IDisplayElement {
    private float fWeatherForecast;
    private float fHumidity;
    private float fPressure;

    public String display() {
        return "Прогноз погоды - " + fWeatherForecast + ", влажность - " + fHumidity + ", давление - " + fPressure;
    }

    public void update(Map<String, Integer> keys) {
        fWeatherForecast = keys.get("fWeatherForecast");
        fHumidity = keys.get("fHumidity");
        fPressure = keys.get("fPressure");
    }
}
