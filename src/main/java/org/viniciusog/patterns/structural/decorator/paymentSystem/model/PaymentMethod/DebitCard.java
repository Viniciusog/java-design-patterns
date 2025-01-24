package org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod;

import java.time.LocalDateTime;

public class DebitCard extends PaymentMethod {

    private String code;
    private String name;
    private LocalDateTime expirationDate;

    public DebitCard(String code,
                     String name,
                     String holderName,
                     LocalDateTime expirationDate) {
        super(PaymentType.DEBIT_CARD, holderName);
        this.code = code;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void print() {
        System.out.printf("Debit Card: %s, %s, %s",
                name, holderName, expirationDate.toString());
    }
}