package org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.factory;

import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.CarRestApiService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.CarService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.UserRestApiService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.UserService;

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