package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.factory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.CarRestApiService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.CarService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.UserRestApiService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.UserService;

public class RestApiAbstractFactory implements ServicesAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}