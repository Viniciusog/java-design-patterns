package org.viniciusog.patterns.structural.bridge.database.dao;

import org.viniciusog.patterns.structural.bridge.database.model.User;

public interface UserDao {
    void save(User user);
}
