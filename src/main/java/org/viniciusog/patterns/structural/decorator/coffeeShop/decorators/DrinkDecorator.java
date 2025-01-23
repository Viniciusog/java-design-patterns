package org.viniciusog.patterns.structural.decorator.coffeeShop.decorators;

import org.viniciusog.patterns.structural.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}