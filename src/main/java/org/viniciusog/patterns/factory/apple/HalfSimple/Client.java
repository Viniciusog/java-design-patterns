package org.viniciusog.patterns.factory.apple.HalfSimple;

import org.viniciusog.patterns.factory.apple.HalfSimple.factory.IPhone11Factory;
import org.viniciusog.patterns.factory.apple.HalfSimple.factory.IPhoneFactory;
import org.viniciusog.patterns.factory.apple.HalfSimple.factory.IPhoneXFactory;
import org.viniciusog.patterns.factory.apple.HalfSimple.model.IPhone;

public class Client {
    public static void main(String[] args) {

        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11Factory = new IPhone11Factory();

        System.out.println("\n###Ordering an Iphone X");
        IPhone iphoneXStandard = iphoneXFactory.orderIPhone("standard");
        System.out.println(iphoneXStandard);

        System.out.println("\n###Ordering an Iphone XSMax");
        IPhone iphoneXHighEnd = iphoneXFactory.orderIPhone("highEnd");
        System.out.println(iphoneXHighEnd);

        System.out.println("\n### Ordering an IPhone 11");
        IPhone iphone11 = iphone11Factory.orderIPhone("standard");
        System.out.println(iphone11);

        System.out.println("\n### Ordering an IPhone11Pro");
        IPhone iphone11Pro = iphone11Factory.orderIPhone("highEnd");
        System.out.println(iphone11Pro);
    }
}