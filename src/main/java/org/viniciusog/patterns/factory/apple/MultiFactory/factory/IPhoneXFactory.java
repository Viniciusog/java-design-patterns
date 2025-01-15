package org.viniciusog.patterns.factory.apple.MultiFactory.factory;

import org.viniciusog.patterns.factory.apple.MultiFactory.model.IPhone;
import org.viniciusog.patterns.factory.apple.MultiFactory.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
