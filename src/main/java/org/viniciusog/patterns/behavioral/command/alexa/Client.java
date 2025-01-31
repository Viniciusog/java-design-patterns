package org.viniciusog.patterns.behavioral.command.alexa;

import org.viniciusog.patterns.behavioral.command.alexa.alexa.Alexa;
import org.viniciusog.patterns.behavioral.command.alexa.commands.TurnLightOffCommand;
import org.viniciusog.patterns.behavioral.command.alexa.commands.TurnLightOnCommand;
import org.viniciusog.patterns.behavioral.command.alexa.lights.PhilipsHuelLight;
import org.viniciusog.patterns.behavioral.command.alexa.lights.XiaomiLight;

public class Client {
    public static void configureAlexa(Alexa alexa) {
        PhilipsHuelLight livingRoom = new PhilipsHuelLight();
        XiaomiLight kitchen = new XiaomiLight();

        alexa.addIntegration("Turn on the living room light", new TurnLightOnCommand(livingRoom),
                "on", "living room", "light");
        alexa.addIntegration("Turn off the living room light", new TurnLightOffCommand(livingRoom),
                "off", "living room", "light");
        alexa.addIntegration("Turn on the kitchen light", new TurnLightOnCommand(kitchen),
                "on", "kitchen", "light");
        alexa.addIntegration("Turn off the kitchen light", new TurnLightOffCommand(kitchen),
                "off", "kitchen", "light");
    }

    public static void main(String[] args) {
        Alexa alexa = new Alexa();
        configureAlexa(alexa);

        alexa.sendRequest("Turn on the living room light");
        alexa.sendRequest("Turn off the kitchen light");

        // since the request is not equal to the key, a keyword search will be executed internally
        alexa.sendRequest("Please, can you turn off the living room light?");
    }
}
