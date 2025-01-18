package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
