package org.viniciusog.patterns.behavioral.command.alexa.alexa;

import org.viniciusog.patterns.behavioral.command.alexa.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class Alexa {

    private Map<String, Command> integrations;
    private AlexaAI ai;

    public Alexa() {
        integrations = new HashMap<>();
        ai = new AlexaAI();
    }

    // keywords is used to search integrations
    public void addIntegration(String key, Command command, String... keywords) {
        integrations.put(key, command);
        ai.addAssociation(key, keywords);
    }

    public void sendRequest(String request) {
        Command command = integrations.get(request);
        // if the request is not exactly the key, then we need
        // to use the 'AI' search to find the correct command
        if (command == null) {
            String key = ai.getFindAssociations(request);
            command = integrations.get(key);
            if (command == null) {
                System.out.println("Sorry, i can't perform your request!");
                return;
            }
        }
        System.out.println("Sending a generic command as you saved in my configurations!");
        command.execute();
    }
}