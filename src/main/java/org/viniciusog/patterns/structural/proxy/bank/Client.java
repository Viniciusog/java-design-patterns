package org.viniciusog.patterns.structural.proxy.bank;

import org.viniciusog.patterns.structural.proxy.bank.services.ATM;
import org.viniciusog.patterns.structural.proxy.bank.services.Bank;
import org.viniciusog.patterns.structural.proxy.bank.services.BankOperations;

public class Client {
    public static void main(String[] args) {
        BankOperations bank = new Bank();
        bank.deposit(111L, 200L);
        bank.withdraw(111L, "senha123", 50L);
        bank.deposit(222L, 300L);
        bank.withdraw(222L, "passwd", 50L);

        System.out.println("\nATM operations:");
        BankOperations atm = new ATM(bank);
        atm.withdraw(111L, "senha123", 600L);
        atm.deposit(111L, 400L);
        atm.changePassword(222L, "passwd", "newpasswd");
    }
}
