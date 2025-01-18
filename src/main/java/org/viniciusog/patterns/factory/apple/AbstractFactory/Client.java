package org.viniciusog.patterns.factory.apple.AbstractFactory;

import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.IPhone11Factory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.IPhoneFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory.BrazilianRulesAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory.USRulesAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {

        //CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
        CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();
        IPhoneFactory iPhoneFactory = new IPhone11Factory(usRules);
        IPhone iphone = iPhoneFactory.orderIphone("standard");
        System.out.println(iphone);
    }
}
