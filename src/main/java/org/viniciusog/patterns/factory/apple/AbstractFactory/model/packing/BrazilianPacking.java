package org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing;

public class BrazilianPacking implements Packing {
    @Override
    public String pack() {
        return "Packing for Brazil";
    }
}