package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.IPhone11Factory;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.IPhoneFactory;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory.USRulesAbstractFactory;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {

        //CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
        CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();
        IPhoneFactory iPhoneFactory = new IPhone11Factory(usRules);
        IPhone iphone = iPhoneFactory.orderIphone("standard");
        System.out.println(iphone);
    }
}
