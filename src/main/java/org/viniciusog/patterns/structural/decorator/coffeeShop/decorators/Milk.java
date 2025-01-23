package org.viniciusog.patterns.structural.decorator.coffeeShop.decorators;

import org.viniciusog.patterns.structural.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        this.drink.serve();
        System.out.println("- Adding 50ml of milk");
    }

    @Override
    public Double getPrice() {
        return this.drink.getPrice() + 0.5d;
    }
}
