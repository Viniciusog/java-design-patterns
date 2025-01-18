package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhone;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhone11;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11(this.rules);
        } else if ("highEnd".equals(level)) {
            return new IPhone11Pro(this.rules);
        }
        return null;
    }
}