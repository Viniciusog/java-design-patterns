package org.viniciusog.patterns.creationalPatterns.builder.builderWithGenerics;

import java.util.List;

public interface MealBuilder {
    void setSize(Size size);
    void setSauce(List<String> sauces);
    void setToppings(List<String> toppings);
    void setCheese(boolean cheese);
    void setPepper(boolean pepper);
}
