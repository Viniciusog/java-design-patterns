package org.viniciusog.patterns.creationalPatterns.builder.builderWithGenerics;

public class PastaBuilder extends DefaultMealBuilder<Pasta>{
    @Override
    public Pasta getResult() {
        return new Pasta(toppings, sauces, size, cheese, pepper);
    }
}
