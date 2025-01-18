package org.viniciusog.patterns.creationalPatterns.factory.MultiFactory;

import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory.IPhone11ProFactory;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory.IPhoneFactory;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.factory.IPhoneXFactory;
import org.viniciusog.patterns.creationalPatterns.factory.MultiFactory.model.IPhone;

public class Client {
    public static void main(String[] args) {

        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhone11ProFactory iphone11ProFactory = new IPhone11ProFactory();

        System.out.println("### Ordering an IPhone X");
        IPhone iphone = iphoneXFactory.orderIPhone();
        System.out.println(iphone);

        System.out.println("### Ordering an IPhone 11 HighEnd");
        IPhone iphone2 = iphone11ProFactory.orderIPhone();
        System.out.println(iphone2);
    }
}