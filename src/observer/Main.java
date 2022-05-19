package observer;

import observer.Classes.*;
import observer.Interfaces.IDisplayElement;

public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        IDisplayElement[] displays = {new CurrentConditionsDisplay(), new ForecastDisplay(), new StatisticsDisplay()};

        weatherData.registerObserver((CurrentConditionsDisplay) displays[0]);
        weatherData.registerObserver((ForecastDisplay) displays[1]);
        weatherData.registerObserver((StatisticsDisplay) displays[2]);

        for (IDisplayElement observer : displays) {
            System.out.println(observer.display());
        }

        weatherData.notifyObservers();

        for (IDisplayElement observer : displays) {
            System.out.println(observer.display());
        }

        weatherData.removeObserver((ForecastDisplay) displays[1]);
        // weatherData.data[5] = 500;

        for (IDisplayElement observer : displays) {
            System.out.println(observer.display());
        }
    }
}
