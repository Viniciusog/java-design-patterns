package org.viniciusog.patterns.creationalPatterns.builder.fluent;

public class FastFoodMealBuilder {

    private String side;
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(String side) {
        this.side = side;
    }

    public FastFoodMealBuilder forDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder andMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(side, drink, main, dessert, gift);
    }
}