package observer.Classes;

import observer.Interfaces.*;

public class ConcreteObserver implements IObserver {
    private int updates;

    public void update() {
        updates++;
    }

    public int getUpdates() {
        return updates;
    }
}
