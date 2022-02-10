package observer;

import observer.Classes.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ConcreteObserver first_observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver second_observer = new ConcreteObserver();

        subject.registerObserver(first_observer);

        subject.setState("Cold");

        System.out.println(first_observer.getUpdates());

        subject.registerObserver(second_observer);

        subject.setState("Sunny");

        System.out.println(first_observer.getUpdates());
        System.out.println(second_observer.getUpdates());

        subject.removeObserver(second_observer);

        subject.setState("Snowy");

        System.out.println(first_observer.getUpdates());
        System.out.println(second_observer.getUpdates());

    }
}
