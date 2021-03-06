package observer;

import observer.Classes.*;
import observer.Interfaces.IDisplayElement;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        IDisplayElement[] displays = {currentConditionsDisplay, forecastDisplay, statisticsDisplay};

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
    }
}
