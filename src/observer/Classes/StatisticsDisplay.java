package observer.Classes;

import observer.Interfaces.IDisplayElement;
import observer.Interfaces.IObserver;

import java.util.Map;

public class StatisticsDisplay implements IObserver, IDisplayElement {
    private float minTemperature;
    private float midTemperature;
    private float maxTemperature;
    private float sHumidity;
    private float sPressure;

    public String display() {
        return "Максимальная температура - " + maxTemperature + ", средняя температура - " + midTemperature + ", минимальная температура - " + minTemperature + ", влажность - " + sHumidity + ", давление - " + sPressure;
    }

    public void update(Map<String, Integer> keys) {
        minTemperature = keys.get("minTemperature");
        midTemperature = keys.get("midTemperature");
        maxTemperature = keys.get("maxTemperature");
        sHumidity = keys.get("sHumidity");
        sPressure = keys.get("sPressure");
    }
}
