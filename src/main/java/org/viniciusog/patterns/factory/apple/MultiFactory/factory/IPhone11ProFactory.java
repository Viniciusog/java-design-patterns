package org.viniciusog.patterns.factory.apple.MultiFactory.factory;

import org.viniciusog.patterns.factory.apple.MultiFactory.model.IPhone;
import org.viniciusog.patterns.factory.apple.MultiFactory.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
