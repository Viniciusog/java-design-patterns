package org.viniciusog.patterns.structural.bridge.database;

import org.viniciusog.patterns.structural.bridge.database.dao.UserMongoDao;
import org.viniciusog.patterns.structural.bridge.database.dao.UserMysqlDao;
import org.viniciusog.patterns.structural.bridge.database.dao.UserOracleDao;
import org.viniciusog.patterns.structural.bridge.database.dao.UserPostgresDao;
import org.viniciusog.patterns.structural.bridge.database.model.User;
import org.viniciusog.patterns.structural.bridge.database.service.UserEJB;
import org.viniciusog.patterns.structural.bridge.database.service.UserRest;
import org.viniciusog.patterns.structural.bridge.database.service.UserService;
import org.viniciusog.patterns.structural.bridge.database.service.UserSoap;

public class Client {
    public static void main(String[] args) {

        User user = new User("Vinicius", "vinicius@gmail.com", "12345");

        UserService userRestMongoService = new UserRest(new UserMongoDao());
        userRestMongoService.save(user);

        UserService userEJBPostgresService = new UserEJB(new UserPostgresDao());
        userEJBPostgresService.save(user);

        UserService userSoapOracleService = new UserSoap(new UserOracleDao());
        userSoapOracleService.save(user);

        UserService userRestMySqlService = new UserRest(new UserMysqlDao());
        userRestMySqlService.save(user);
    }
}
