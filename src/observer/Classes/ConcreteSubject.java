package observer.Classes;

import observer.Interfaces.*;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {

    private String weather;
    private ArrayList<IObserver> observers = new ArrayList<>();

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public String getState(){
        return weather;
    }

    public void setState(String weather){
        this.weather = weather;
        notifyObservers();
    }
}
