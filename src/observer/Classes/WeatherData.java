package observer.Classes;

import observer.Interfaces.*;

import java.util.*;

public class WeatherData implements ISubject {
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();
    private Map<String, Integer> keys = new HashMap<String, Integer>();
    public String[] data = {"temperature", "humidity", "pressure", "minTemperature",
            "midTemperature", "maxTemperature", "sHumidity", "sPressure", "fWeatherForecast", "fHumidity", "fPressure",
            "cTemperature", "cHumidity", "cPressure"};

    public WeatherData() {
        Random random = new Random();
        for (String key : data) {
            keys.put(key, random.nextInt(100));
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

    /*
    public int This(String var) {
        keys[var] = value;
        this.notifyObserver();
    }
     */
}
