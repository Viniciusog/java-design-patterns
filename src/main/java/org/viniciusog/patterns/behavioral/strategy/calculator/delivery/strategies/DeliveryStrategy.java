package org.viniciusog.patterns.behavioral.strategy.calculator.delivery.strategies;

import org.viniciusog.patterns.behavioral.strategy.calculator.delivery.Order;

public interface DeliveryStrategy {
    Double totalPrice(Order order);
    boolean canBeApplied(Order order);
}
