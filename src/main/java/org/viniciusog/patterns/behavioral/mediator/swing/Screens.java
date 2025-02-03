package org.viniciusog.patterns.behavioral.mediator.swing;

import org.viniciusog.patterns.behavioral.mediator.swing.components.AddButton;
import org.viniciusog.patterns.behavioral.mediator.swing.components.Label;
import org.viniciusog.patterns.behavioral.mediator.swing.components.ResetButton;
import org.viniciusog.patterns.behavioral.mediator.swing.components.State;
import org.viniciusog.patterns.behavioral.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Screens {

    private AddButton button;
    private ResetButton reset;
    private Label label;
    private State state;
    private Mediator mediator;

    public Screens() {
        mediator = new Mediator();
        button = new AddButton(mediator);
        reset = new ResetButton(mediator);
        state = new State(mediator);
        label = new Label(mediator);
        mediator.setAddButton(button);
        mediator.setLabel(label);
        mediator.setState(state);
    }

    private void initButtonScreen(Mediator mediator) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Button's Screen");
        frame.setLayout(new BorderLayout());

        frame.add(reset, BorderLayout.WEST);
        frame.add(button, BorderLayout.CENTER);

        frame.setSize(400,200);
        frame.setVisible(true);
    }

    private void initCounterScreen(Mediator mediator) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Counter's Screen");

        frame.add(label);

        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public void init() {
        initButtonScreen(mediator);
        initCounterScreen(mediator);
    }
}
