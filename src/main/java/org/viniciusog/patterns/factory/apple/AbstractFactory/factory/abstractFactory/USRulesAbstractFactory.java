package org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory;

import org.viniciusog.patterns.factory.apple.AbstractFactory.model.certificate.Certificate;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.certificate.USCertificate;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing.Packing;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing.USPacking;

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
