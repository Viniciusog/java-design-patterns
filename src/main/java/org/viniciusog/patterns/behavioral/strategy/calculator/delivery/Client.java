package org.viniciusog.patterns.behavioral.strategy.calculator.delivery;

import org.viniciusog.patterns.behavioral.strategy.calculator.delivery.strategies.DeliveryStrategy;
import org.viniciusog.patterns.behavioral.strategy.calculator.delivery.strategies.ExpressDeliveryStrategy;
import org.viniciusog.patterns.behavioral.strategy.calculator.delivery.strategies.StandardDeliveryStrategy;

public class Client {

    public static void main(String[] args) {

        Order order = new Order(120D, 1.5D);
        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(
                new ExpressDeliveryStrategy(),
                new StandardDeliveryStrategy()
        );
        DeliveryStrategy strategy = deliveryProcessor.getAvailableDelivery(order);
        System.out.println("Total price: " + strategy.totalPrice(order));
    }
}
