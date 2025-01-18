package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.certificate.Certificate;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.certificate.USCertificate;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.packing.Packing;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificate() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
