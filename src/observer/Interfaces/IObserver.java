package observer.Interfaces;

import java.util.Map;

public interface IObserver {
    void update(Map<String, Integer> keys);
}
