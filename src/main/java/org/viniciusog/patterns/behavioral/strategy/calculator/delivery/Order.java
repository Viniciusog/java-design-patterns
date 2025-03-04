package org.viniciusog.patterns.behavioral.strategy.calculator.delivery;

public class Order {

    private Double price;
    private Double totalWeightKg;

    public Order(Double price, Double totalWeightKg) {
        this.price = price;
        this.totalWeightKg = totalWeightKg;
    }

    public Double getPrice() {
        return price;
    }

    public Double getTotalWeightKg() {
        return totalWeightKg;
    }
}