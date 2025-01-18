package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service;

public class UserEJBService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Saving user: " + name + " through EJB's interface");
    }

    @Override
    public void remove(Integer id) {
        System.out.println("Removing User with id: " + id + " through EJB's interface");
    }
}
