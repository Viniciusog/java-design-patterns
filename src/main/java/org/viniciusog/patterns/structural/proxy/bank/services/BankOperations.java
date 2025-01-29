package org.viniciusog.patterns.structural.proxy.bank.services;

public interface BankOperations {
    void deposit(Long account, Long amount);
    void withdraw(Long account, String password, Long amount);
    void changePassword(Long account, String oldPassword, String newPassword);
}
