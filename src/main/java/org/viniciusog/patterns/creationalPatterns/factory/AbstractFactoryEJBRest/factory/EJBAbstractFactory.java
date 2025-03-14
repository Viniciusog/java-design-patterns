package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.factory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.CarEJBService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.CarService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.UserEJBService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.UserService;

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