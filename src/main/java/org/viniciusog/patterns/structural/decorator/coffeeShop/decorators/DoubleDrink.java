package org.viniciusog.patterns.structural.decorator.coffeeShop.decorators;

import org.viniciusog.patterns.structural.decorator.coffeeShop.model.Drink;

public class DoubleDrink extends DrinkDecorator {

    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.75;
    }
}