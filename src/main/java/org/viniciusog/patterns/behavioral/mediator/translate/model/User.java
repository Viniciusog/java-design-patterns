package org.viniciusog.patterns.behavioral.mediator.translate.model;

import org.viniciusog.patterns.behavioral.mediator.translate.mediator.Mediator;

public class User {
    final protected String name;
    final protected Language language;
    final protected Mediator mediator;

    public User(String name, Language language, Mediator mediator) {
        this.name = name;
        this.language = language;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }

    public void sendMessage(String message) {
        sendMessage(message, null);
    }

    public void sendMessage(String message, User to) {
        String receiverName = to != null ? to.getName() : "ALL";
        System.out.println(String.format("'%s' is sending the message '%s' to '%s'",
                getName(), message, receiverName));
        mediator.sendMessage(message, to, this); // message, to, from
    }

    public void receiveMessage(String message, User from) {
        System.out.println(String.format("'%s' has received the message '%s' from '%s'",
                getName(), message, from.getName()));
    }
}
