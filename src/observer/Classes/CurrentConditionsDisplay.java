package observer.Classes;

import observer.Interfaces.IDisplayElement;
import observer.Interfaces.IObserver;

import java.util.Map;

public class CurrentConditionsDisplay extends WeatherData implements IObserver, IDisplayElement {
    private float cTemperature;
    private float cHumidity;
    private float cPressure;

    public String display() {
        return "В данный момент температура - " + cTemperature + "C, влажность - " + cHumidity + ", давление - " + cPressure;
    }

    public void update(Map<String, Integer> keys) {
        cTemperature = keys.get(11);
        cHumidity = keys.get(12);
        cPressure = keys.get(13);
    }

     /*
    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    */
}
