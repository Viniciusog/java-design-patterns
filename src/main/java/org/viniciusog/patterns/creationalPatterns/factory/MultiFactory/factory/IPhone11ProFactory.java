package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
