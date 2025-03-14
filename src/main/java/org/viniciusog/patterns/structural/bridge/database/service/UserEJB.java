package org.viniciusog.patterns.structural.bridge.database.service;

import org.viniciusog.patterns.structural.bridge.database.dao.UserDao;
import org.viniciusog.patterns.structural.bridge.database.model.User;

public class UserEJB extends UserService {

    public UserEJB(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB protocol!");
        dao.save(user);
    }
}