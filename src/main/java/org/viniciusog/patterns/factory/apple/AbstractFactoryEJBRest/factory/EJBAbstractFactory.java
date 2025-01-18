package org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.factory;

import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.CarEJBService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.CarService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.UserEJBService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}