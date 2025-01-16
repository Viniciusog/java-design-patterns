package org.viniciusog.patterns.factory.apple.AbstractFactory.factory;

import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.iphone.IPhone;

public abstract class IPhoneFactory {
    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIphone(String level) {
        IPhone device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(String level);
}