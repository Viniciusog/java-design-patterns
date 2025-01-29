package org.viniciusog.patterns.structural.proxy.bank.services;

public class ATM implements BankOperations {

    private BankOperations bank;

    public ATM(BankOperations bankOperations) {
        bank = bankOperations;
    }

    @Override
    public void deposit(Long account, Long amount) {
        System.out.println("ATM proxy sending deposit request to bank");
        bank.deposit(account, amount);
    }

    @Override
    public void withdraw(Long account, String password, Long amount) {
        if (amount > 300) {
            System.out.println("You may not withdraw amount over 300 here");
            return;
        }
        System.out.println("ATM proxy sending withdraw request to bank");
        bank.withdraw(account, password, amount);
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("\nYou must go to the bank to perform this operation");
        return;
    }
}
