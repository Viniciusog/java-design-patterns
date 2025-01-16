package org.viniciusog.patterns.factory.apple.AbstractFactory.model.packing;

public class USPacking implements Packing {
    @Override
    public String pack() {
        return "Packing for US";
    }
}
