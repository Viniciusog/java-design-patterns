package org.viniciusog.patterns.structural.proxy.bank.services;

import org.viniciusog.patterns.structural.proxy.bank.model.User;

import java.util.HashMap;
import java.util.Map;

public class Bank implements BankOperations {

    private Map<Long, User> userDatabase;

    public Bank() {
        userDatabase = new HashMap<>();
        userDatabase.put(111L, new User("Ronaldo", 111L, "senha123", 1000L));
        userDatabase.put(222L, new User("Fernando", 222L, "passwd", 200L));
    }

    @Override
    public void deposit(Long account, Long amount) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }

        user.setBalance(user.getBalance() + amount);
        System.out.printf("\n[DEPOSIT] User: %s, +%d, Total balance: %d",
                user.getName(), amount, user.getBalance());

    }

    @Override
    public void withdraw(Long account, String password, Long amount) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }

        if (!user.getPassword().equals(password)) {
            System.out.println("Invalid password!");
            return;
        }
        user.setBalance(user.getBalance() - amount);
        System.out.printf("\n[WITHDRAW] User: %s, -%d, Total balance: %d",
                user.getName(), amount, user.getBalance());
    }

    @Override
    public void changePassword(Long account, String oldPassword, String newPassword) {
        User user = userDatabase.get(account);
        if (user == null) {
            System.out.println("Invalid account");
            return;
        }

        if (!user.getPassword().equals(oldPassword)) {
            System.out.println("Invalid password!");
            return;
        }
        user.setPassword(newPassword);
        System.out.printf("Password changed successfully to %s", user.getName());
    }
}