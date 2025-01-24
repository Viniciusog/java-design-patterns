package org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod;

public class PIX extends PaymentMethod {

    private String key;

    public PIX(String key, String holderName) {
        super(PaymentType.PIX, holderName);
        this.key = key;
    }

    @Override
    void print() {
        System.out.printf("Pix: %s, %s", key, holderName);
    }
}