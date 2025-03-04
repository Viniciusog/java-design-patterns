package org.viniciusog.patterns.behavioral.strategy.calculator.delivery.strategies;

import org.viniciusog.patterns.behavioral.strategy.calculator.delivery.Order;

public class StandardDeliveryStrategy implements DeliveryStrategy {
    @Override
    public Double totalPrice(Order order) {
        return order.getPrice() + 5;
    }

    @Override
    public boolean canBeApplied(Order order) {
        return order.getPrice() < 100;
    }
}