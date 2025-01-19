package org.viniciusog.patterns.creationalPatterns.builder.fluent;

public class Client {
    public static void main(String[] args) {

        FastFoodMeal burguerCombo = new FastFoodMealBuilder("fries")
                .andMain("CheeseBurguer")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(burguerCombo);

        FastFoodMeal justFries = new FastFoodMealBuilder("Fries")
                .thatsAll();
        System.out.println(justFries);

        FastFoodMeal largeCombo = new FastFoodMealBuilder("Large Fries")
                .andMain("Monster burguer")
                .andDessert("Milk shake")
                .thatsAll();
        System.out.println(largeCombo);
    }
}