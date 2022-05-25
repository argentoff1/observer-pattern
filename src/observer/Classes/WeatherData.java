package observer.Classes;

import observer.Interfaces.*;

import java.lang.*;
import java.util.*;

public class WeatherData implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private HashMap<String, Integer> keys = new HashMap<>();
    public List<String> data = new ArrayList<>();

    {
        data.add("temperature");
        data.add("humidity");
        data.add("pressure");
        data.add("minTemperature");
        data.add("midTemperature");
        data.add("maxTemperature");
        data.add("sHumidity");
        data.add("sPressure");
        data.add("fWeatherForecast");
        data.add("fHumidity");
        data.add("fPressure");
        data.add("cTemperature");
        data.add("cHumidity");
        data.add("cPressure");
    }

    public WeatherData() {
        for (String key : data) {
            keys.put(key, (int) (Math.random() * 101));
        }
    }

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(keys);
        }
    }
}