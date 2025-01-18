package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.factory.abstractFactory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.certificate.Certificate;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificate();
    Packing getPacking();
}