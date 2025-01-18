package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhone;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhoneX;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IPhoneX(this.rules);
        } else if ("highEnd".equals(level)) {
            return new IPhoneXSMax(this.rules);
        }
        return null;
    }
}