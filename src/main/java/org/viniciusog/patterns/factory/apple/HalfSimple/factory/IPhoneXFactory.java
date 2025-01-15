package org.viniciusog.patterns.factory.apple.HalfSimple.factory;

import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhone;
import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhoneX;
import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {

        if (level.equals("standard")) {
            return new IPhoneX();
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax();
        }
        return null;
    }
}