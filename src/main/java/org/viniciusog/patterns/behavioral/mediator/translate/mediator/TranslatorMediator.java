package org.viniciusog.patterns.behavioral.mediator.translate.mediator;

import org.viniciusog.patterns.behavioral.mediator.translate.model.User;
import org.viniciusog.patterns.behavioral.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator{

    private Translator translator;

    public TranslatorMediator() {
        this.translator = new Translator();
    }

    @Override
    protected String getMessage(String message, User to, User from) {
        return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
    }
}
