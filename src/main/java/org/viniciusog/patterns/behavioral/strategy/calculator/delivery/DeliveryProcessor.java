package org.viniciusog.patterns.behavioral.strategy.calculator.delivery;

import org.viniciusog.patterns.behavioral.strategy.calculator.delivery.strategies.DeliveryStrategy;

import java.util.Arrays;
import java.util.List;

public class DeliveryProcessor {

    private List<DeliveryStrategy> deliveryStrategies;

    public DeliveryProcessor(DeliveryStrategy ...strategies) {
        deliveryStrategies = Arrays.stream(strategies).toList();
    }

    public DeliveryStrategy getAvailableDelivery(Order order) {
        return deliveryStrategies
                .stream()
                .filter(s -> s.canBeApplied(order))
                .toList().getFirst();
    }
}
