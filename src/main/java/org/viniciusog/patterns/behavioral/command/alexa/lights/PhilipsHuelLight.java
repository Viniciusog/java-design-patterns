package org.viniciusog.patterns.behavioral.command.alexa.lights;

public class PhilipsHuelLight implements GenericLight {
    @Override
    public void turnOn() {
        System.out.println("the PhilipsHuelLight is On");
    }

    @Override
    public void turnOff() {
        System.out.println("the PhilipsHuelLight is Off");
    }
}
