package org.viniciusog.patterns.factory.apple.SimpleFactory;

import org.viniciusog.patterns.factory.apple.SimpleFactory.factory.IPhoneSimpleFactory;
import org.viniciusog.patterns.factory.apple.SimpleFactory.model.IPhone;

public class Client {
    public static void main(String[] args) {

        System.out.println("Ordering iphone X");
        IPhone iphoneX = IPhoneSimpleFactory.orderIPhone("X", "standard");
        iphoneX.getHardware();
        System.out.println(iphoneX);

        System.out.println("\nOrdering iphone XSMax");
        IPhone iphoneXSMax = IPhoneSimpleFactory.orderIPhone("X", "highEnd");
        iphoneXSMax.getHardware();
        System.out.println(iphoneXSMax);

        System.out.println("\nOrdering iphone 11");
        IPhone iphone11 = IPhoneSimpleFactory.orderIPhone("11", "standard");
        iphone11.getHardware();
        System.out.println(iphone11);

        System.out.println("\nOrdering iphone 11 Pro");
        IPhone iphone11Pro = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
        iphone11Pro.getHardware();
        System.out.println(iphone11Pro);
    }
}