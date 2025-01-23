package org.viniciusog.patterns.structural.bridge.database.dao;

import org.viniciusog.patterns.structural.bridge.database.model.User;

public class UserPostgresDao implements UserDao {
    @Override
    public void save(User user) {
        System.out.println(">> Saving user with Postgres");
    }
}
