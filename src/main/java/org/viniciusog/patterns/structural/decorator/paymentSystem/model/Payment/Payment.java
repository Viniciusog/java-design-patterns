package org.viniciusog.patterns.structural.decorator.paymentSystem.model.Payment;

import org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod.PaymentMethod;

import java.time.LocalDateTime;

public abstract class Payment {
    protected String recipient;
    protected Double total;
    private Double totalToRecipient;
    protected PaymentMethod paymentMethod;
    protected LocalDateTime time;
    protected String description;

    public Payment() {

    }

    public Payment(String recipient, Double total, PaymentMethod method, LocalDateTime time, String description) {
        this.recipient = recipient;
        this.total = total;
        this.totalToRecipient = total;
        this.paymentMethod = method;
        this.time = time;
        this.description = description;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setTotalToRecipient(Double value) {
        this.totalToRecipient = value;
    }

    public Double getTotalToRecipient() {
        return totalToRecipient;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public abstract void pay();
}