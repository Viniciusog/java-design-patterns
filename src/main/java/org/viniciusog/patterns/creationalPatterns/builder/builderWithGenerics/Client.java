package org.viniciusog.patterns.creationalPatterns.builder.builderWithGenerics;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        DefaultMealBuilder builder = new PastaBuilder();
        builder.setToppings(List.of("Topping1"));
        builder.setCheese(true);
        builder.setPepper(true);
        System.out.println(builder.getResult());
    }
}
