package org.viniciusog.patterns.behavioral.mediator.translate.model;

import org.viniciusog.patterns.behavioral.mediator.translate.mediator.Mediator;

public class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, Language.PORTUGUESE, mediator);
    }
}
