package org.viniciusog.patterns.behavioral.mediator.swing.mediator;

import org.viniciusog.patterns.behavioral.mediator.swing.components.AddButton;
import org.viniciusog.patterns.behavioral.mediator.swing.components.Label;
import org.viniciusog.patterns.behavioral.mediator.swing.components.State;

public class Mediator {

    private AddButton addButton;
    private Label label;
    private State state;

    public void buttonClicked() {
        state.addCount();
        label.refresh();
    }

    public void stop() {
        addButton.setEnabled(false);
    }

    public void reset() {
        state.setCounter(0);
        addButton.setEnabled(true);
        label.refresh();
    }

    public int getCounterValue() {
        return state.getCounter();
    }

    public void setAddButton(AddButton button) {
        this.addButton = button;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void setState(State state) {
        this.state = state;
    }
}
