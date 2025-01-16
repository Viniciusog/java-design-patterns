package org.viniciusog.patterns.factory.apple.AbstractFactory.factory.abstractFactory;

import org.viniciusog.patterns.factory.apple.AbstractFactory.model.certificate.Certificate;
import org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificate();
    Packing getPacking();
}