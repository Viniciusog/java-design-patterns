package org.viniciusog.patterns.behavioral.chain.billsDispenser;

public class Client {
    public static void main(String[] args) {

        Dispenser dispenser = new Dispenser();
        dispenser.withdraw(157);

        Dispenser dispenser2 = new Dispenser(new Bill(512), new Bill(256),
                new Bill(128), new Bill(64), new Bill(32), new Bill(16),
                new Bill(8), new Bill(4), new Bill(2), new Bill(1));

        System.out.println("\n--------");
        dispenser2.withdraw(359);
    }
}
