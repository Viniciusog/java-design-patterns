package org.viniciusog.patterns.behavioral.mediator.swing.components;

import org.viniciusog.patterns.behavioral.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {
    private static final long serialVersionUID = 10983724176573485L;

    public AddButton(Mediator mediator) {
        super("Click me!");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.buttonClicked();
            }
        });
    }
}