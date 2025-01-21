package org.viniciusog.patterns.creationalPatterns.builder.builderWithGenerics;

import java.util.List;

public class Pasta extends Meal {
    public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        super(toppings, sauces, size, cheese, pepper);
    }


}
