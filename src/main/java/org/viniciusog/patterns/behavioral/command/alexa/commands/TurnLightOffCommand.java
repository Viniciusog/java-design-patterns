package org.viniciusog.patterns.behavioral.command.alexa.commands;

import org.viniciusog.patterns.behavioral.command.alexa.lights.GenericLight;

public class TurnLightOffCommand implements Command {
    private GenericLight light;

    public TurnLightOffCommand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
