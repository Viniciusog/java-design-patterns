package org.viniciusog.patterns.creationalPatterns.builder.functional;

public class Client {

    public static void main(String[] args) {

        FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
                .withDrink("Coke")
                .andMain("Cheeseburguer")
                .thatsAll();

        System.out.println(burguerCombo);
    }
}
