package org.viniciusog.patterns.factory.apple.HalfSimple.factory;

import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhone;
import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhone11;
import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11();
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro();
        }
        return null;
    }
}
