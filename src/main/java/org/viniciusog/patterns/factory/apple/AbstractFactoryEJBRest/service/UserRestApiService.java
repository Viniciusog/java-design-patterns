package org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service;

public class UserRestApiService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Saving user " + name + " through Rest Api's interface");
    }

    @Override
    public void remove(Integer id) {
        System.out.println("Removing user with id: " + id + " through Rest Api's interface");
    }
}
