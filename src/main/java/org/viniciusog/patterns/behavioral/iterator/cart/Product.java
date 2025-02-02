package org.viniciusog.patterns.behavioral.iterator.cart;

public class Product {

    private String description;
    private Double value;

    public Product(String description, Double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }
}