package org.viniciusog.patterns.behavioral.mediator.swing.components;

import org.viniciusog.patterns.behavioral.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton  {

    private static final long serialVersionUID = 34256113421578904L;

    public ResetButton(Mediator mediator) {
        super("Reset");

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.reset();
            }
        });
    }
}