package org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.factory;

import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.CarService;
import org.viniciusog.patterns.creationalPatterns.factory.AbstractFactoryEJBRest.service.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
