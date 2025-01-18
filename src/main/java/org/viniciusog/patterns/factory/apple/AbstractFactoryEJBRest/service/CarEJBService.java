package org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service;

public class CarEJBService implements CarService{
    @Override
    public void save(String model) {
        System.out.println("Saving " + model + " car through EJB's interface");
    }

    @Override
    public void update(String model) {
        System.out.println("Updating " + model + " car through EJB's interface");
    }
}
