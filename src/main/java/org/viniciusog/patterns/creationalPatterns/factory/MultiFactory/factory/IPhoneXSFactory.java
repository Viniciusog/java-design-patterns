package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhoneXSMax;

public class IPhoneXSFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}