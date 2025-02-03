package org.viniciusog.patterns.behavioral.mediator.swing.components;

import org.viniciusog.patterns.behavioral.mediator.swing.mediator.Mediator;

public class State {

    private Mediator mediator;
    private int counter;

    public State(Mediator mediator) {
        this.mediator = mediator;
        this.counter = 0;
    }

    public void addCount() {
        counter++;
        if (counter == 10) {
            mediator.stop();
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
