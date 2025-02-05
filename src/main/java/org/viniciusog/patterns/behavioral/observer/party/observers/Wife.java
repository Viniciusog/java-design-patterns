package org.viniciusog.patterns.behavioral.observer.party.observers;

public class Wife implements Observer {

    public void partyTime() {
        System.out.println("Lets party!");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            partyTime();
        } else {
            System.out.println("hold!");
        }
    }
}
