package org.viniciusog.patterns.behavioral.observer.party.observers;

public class Friend implements Observer {

    public void sendGift() {
        System.out.println("look, i bought your favorite game!");
    }

    @Override
    public void update(boolean status) {
        if (status) {
            sendGift();
        } else {
            System.out.println("sleep...");
        }
    }
}