package org.viniciusog.patterns.creationalPatterns.builder;

public class FastFoodMeal {

    private String side;
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMeal(String side, String drink, String main, String dessert, String gift) {
        this.side = side;
        this.drink = drink;
        this.main = main;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getSide() {
        return side;
    }

    public String getDrink() {
        return drink;
    }

    public String getMain() {
        return main;
    }

    public String getDessert() {
        return dessert;
    }

    public String getGift() {
        return gift;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                ", main='" + main + '\'' +
                ", dessert='" + dessert + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }
}