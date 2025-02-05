package org.viniciusog.patterns.behavioral.observer.party.subject;

import org.viniciusog.patterns.behavioral.observer.party.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(boolean status) {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}