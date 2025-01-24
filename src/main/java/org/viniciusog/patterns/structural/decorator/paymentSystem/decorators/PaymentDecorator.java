package org.viniciusog.patterns.structural.decorator.paymentSystem.decorators;

import org.viniciusog.patterns.structural.decorator.paymentSystem.model.Payment.Payment;

public abstract class PaymentDecorator extends Payment {
    protected Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }
}