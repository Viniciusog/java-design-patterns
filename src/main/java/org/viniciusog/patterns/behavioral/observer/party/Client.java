package org.viniciusog.patterns.behavioral.observer.party;

import org.viniciusog.patterns.behavioral.observer.party.observers.Friend;
import org.viniciusog.patterns.behavioral.observer.party.observers.Wife;
import org.viniciusog.patterns.behavioral.observer.party.subject.Doorman;

public class Client {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.add(new Wife());
        doorman.add(new Friend());

        doorman.setStatus(true);
        doorman.setStatus(true);
        System.out.println("------------");
        doorman.setStatus(false);
    }
}
