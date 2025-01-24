package org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod;

public abstract class PaymentMethod {

    protected PaymentType type;
    protected String holderName;

    public PaymentMethod(PaymentType type, String holderName) {
        this.type = type;
    }

    public PaymentType getType() {
        return type;
    }

    public String getHolderName() {
        return holderName;
    }

    abstract void print();
}