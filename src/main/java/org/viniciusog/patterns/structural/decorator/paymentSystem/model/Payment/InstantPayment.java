package org.viniciusog.patterns.structural.decorator.paymentSystem.model.Payment;

import org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod.PaymentMethod;

import java.time.LocalDateTime;

public class InstantPayment extends Payment {

    public InstantPayment(String recipient, Double total,
                          LocalDateTime time, PaymentMethod paymentMethod,
                          String description) {
        super(recipient, total, paymentMethod, time, description);
    }


    @Override
    public void pay() {
        System.out.printf("""
                \n
                Instant Payment executed
                >> Recipient: %s
                >> Description: %s
                >> Total to recipient: %f
                >> Time: %s
                >> Payment Method: %s
                """, recipient, description, getTotalToRecipient(), time, paymentMethod.getType());
    }
}