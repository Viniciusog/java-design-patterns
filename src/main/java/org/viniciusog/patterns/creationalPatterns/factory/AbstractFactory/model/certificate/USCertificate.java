package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactory.model.certificate;

public class USCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "Applying certification for US";
    }
}
