package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service;

public class CarRestApiService implements CarService {
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through Rest's interface");
    }

    @Override
    public void update(String model) {
        System.out.println("Updating " + model + " car through Rest's interface");
    }
}
