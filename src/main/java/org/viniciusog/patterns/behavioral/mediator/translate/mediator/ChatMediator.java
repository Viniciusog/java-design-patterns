package org.viniciusog.patterns.behavioral.mediator.translate.mediator;

import org.viniciusog.patterns.behavioral.mediator.translate.model.User;

public class ChatMediator extends Mediator {

    @Override
    protected String getMessage(String message, User to, User from) {
        return message;
    }
}
