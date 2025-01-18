package org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest;

import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.factory.RestApiAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.factory.ServicesAbstractFactory;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.UserService;

public class Client {

    public static void main(String[] args) {

        //ServicesAbstractFactory serviceAbstractFactory = new EJBAbstractFactory();
        ServicesAbstractFactory serviceAbstractFactory = new RestApiAbstractFactory();
        UserService userService = serviceAbstractFactory.getUserService();
        userService.save("Vinicius");
        userService.remove(1);
    }
}