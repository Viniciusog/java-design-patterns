package org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory;

import org.viniciusog.patterns.factory.apple.AbstractFactory.model.certificate.BrazilianCertificate;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.certificate.Certificate;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing.BrazilianPacking;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificate() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
