package org.viniciusog.patterns.factory.apple.AbstractFactory.model.certificate;

public class USCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "Applying certification for US";
    }
}
