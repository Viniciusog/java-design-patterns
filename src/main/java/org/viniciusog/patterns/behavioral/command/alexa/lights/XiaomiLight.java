package org.viniciusog.patterns.behavioral.command.alexa.lights;

public class XiaomiLight implements GenericLight {
    @Override
    public void turnOn() {
        System.out.println("The Xiaomi light is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The Xiaomi light is Off");
    }
}
