package org.viniciusog.patterns.behavioral.command.alexa.commands;

import org.viniciusog.patterns.behavioral.command.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command {
    private GenericLight light;

    public TurnLightOnCommand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
