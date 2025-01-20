package org.viniciusog.patterns.creationalPatterns.builder.builderWithGenerics;

import java.util.List;

public abstract class Meal {

    protected List<String> toppings;
    protected List<String> sauces;
    protected Size size;
    protected boolean cheese;
    protected boolean pepper;

    public Meal(List<String> toppings, List<String> sauces, Size size,
                boolean cheese,
                boolean pepper) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
        this.pepper = pepper;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public Size getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepper() {
        return pepper;
    }
}
