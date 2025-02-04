package org.viniciusog.patterns.behavioral.mediator.translate.model;

import org.viniciusog.patterns.behavioral.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

    public EnglishUser(String name, Mediator mediator) {
        super(name, Language.ENGLISH, mediator);
    }
}
