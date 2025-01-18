package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
