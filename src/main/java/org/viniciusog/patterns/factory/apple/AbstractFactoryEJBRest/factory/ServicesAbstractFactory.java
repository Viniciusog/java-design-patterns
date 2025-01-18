package org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.factory;

import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.CarService;
import org.viniciusog.patterns.factory.apple.AbstractFactoryEJBRest.service.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
