package org.viniciusog.patterns.structural.bridge.database.service;

import org.viniciusog.patterns.structural.bridge.database.dao.UserDao;
import org.viniciusog.patterns.structural.bridge.database.model.User;

public abstract class UserService {

    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    abstract public void save(User user);
}