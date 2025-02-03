package org.viniciusog.patterns.behavioral.mediator.swing.components;

import org.viniciusog.patterns.behavioral.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    private static final long serialVersionUID = 67312873491453245L;
    private Mediator mediator;

    public Label(Mediator mediator) {
        super("Times clicked: 0");
        setFont(new Font(getFont().getName(), Font.BOLD, 30));

        this.mediator = mediator;
    }

    public void refresh() {
        super.setText("Times clicked: " + mediator.getCounterValue());
    }
}