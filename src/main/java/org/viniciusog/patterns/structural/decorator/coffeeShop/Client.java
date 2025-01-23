package org.viniciusog.patterns.structural.decorator.coffeeShop;

import org.viniciusog.patterns.structural.decorator.coffeeShop.decorators.DoubleDrink;
import org.viniciusog.patterns.structural.decorator.coffeeShop.decorators.Milk;
import org.viniciusog.patterns.structural.decorator.coffeeShop.model.Expresso;
import org.viniciusog.patterns.structural.decorator.coffeeShop.model.Tea;

public class Client {
    public static void main(String[] args) {

        DoubleDrink doubleExpresso = new DoubleDrink(new Expresso());
        doubleExpresso.serve();
        System.out.println("Double expresso price: " + doubleExpresso.getPrice() + "\n");

        DoubleDrink doubleTea = new DoubleDrink(new Tea());
        doubleTea.serve();
        System.out.println("Double tea price: " + doubleTea.getPrice() + "\n");

        Milk milkWithExpresso = new Milk(new Expresso());
        milkWithExpresso.serve();
        System.out.println("Price milk with expresso: " + milkWithExpresso.getPrice());
    }
}