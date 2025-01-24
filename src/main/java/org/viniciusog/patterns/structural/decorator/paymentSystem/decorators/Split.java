package org.viniciusog.patterns.structural.decorator.paymentSystem.decorators;

import org.viniciusog.patterns.structural.decorator.paymentSystem.model.Payment.Payment;

public class Split extends PaymentDecorator {

    private String secondRecipient;
    private Double totalToSecondRecipient;

    public Split(Payment payment, String secondRecipient, Double percentageToFirstRecipient) {
       super(payment);
       this.secondRecipient = secondRecipient;
       split(percentageToFirstRecipient);
    }

    private void split(Double percentageToFirstRecipient) {
        Double percentageToSecondRecipient = 1 - percentageToFirstRecipient;
        Double amountToFirstRecipient = this.payment.getTotal() * percentageToFirstRecipient;
        Double amountToSecondRecipient = this.payment.getTotal() * percentageToSecondRecipient;
        this.payment.setTotalToRecipient(amountToFirstRecipient);
        this.totalToSecondRecipient = amountToSecondRecipient;
    }

    @Override
    public void pay() {
        System.out.printf("""
                \n
                Split Payment executed
                >> Payment Method: %s
                >> Description: %s
                >> Time: %s
                >> Total: %f
                >> First recipient:
                    Name:  %s
                    Total: $%f
                >> Second recipient:
                    Name:  %s
                    Total: $%f
                """, payment.getPaymentMethod().getType(), payment.getDescription(), payment.getTime(),
                payment.getTotal(), payment.getRecipient(), payment.getTotalToRecipient(),
                this.secondRecipient, this.totalToSecondRecipient);
    }
}