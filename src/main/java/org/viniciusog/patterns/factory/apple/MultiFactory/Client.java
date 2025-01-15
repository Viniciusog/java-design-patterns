package org.viniciusog.patterns.factory.apple.MultiFactory;

import org.viniciusog.patterns.factory.apple.MultiFactory.factory.IPhone11ProFactory;
import org.viniciusog.patterns.factory.apple.MultiFactory.factory.IPhoneFactory;
import org.viniciusog.patterns.factory.apple.MultiFactory.factory.IPhoneXFactory;
import org.viniciusog.patterns.factory.apple.MultiFactory.model.IPhone;
import org.viniciusog.patterns.factory.apple.MultiFactory.model.IPhone11Pro;

public class Client {
    public static void main(String[] args) {

        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhone11ProFactory iPhone11ProFactory = new IPhone11ProFactory();
    }
}

