package observer.Classes;

import observer.Interfaces.IDisplayElement;
import observer.Interfaces.IObserver;
import observer.Interfaces.ISubject;

import java.util.Map;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float cTemperature;
    private float cHumidity;
    private float cPressure;

    public String display() {
        return "В данный момент температура - " + cTemperature + "C, влажность - " + cHumidity + ", давление - " + cPressure;
    }

    public void update(Map<String, Integer> keys) {
        cTemperature = keys.get("cTemperature");
        cHumidity = keys.get("cHumidity");
        cPressure = keys.get("cPressure");
    }

     /*
    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    */
}
