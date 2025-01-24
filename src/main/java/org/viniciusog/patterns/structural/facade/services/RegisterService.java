package org.viniciusog.patterns.structural.facade.services;

import org.viniciusog.patterns.structural.facade.model.Card;
import org.viniciusog.patterns.structural.facade.model.Register;

import java.util.*;

public class RegisterService {
    private Map<Long, List<Register>> memory;

    public RegisterService() {
        memory = new HashMap<>();
        memory.put(55555L, new ArrayList<>(Arrays.asList(
                new Register("Sorveteria", 10d, new Date()),
                new Register("Pizzaria São Carlos", 60d, new Date()),
                new Register("Shopping SP", 85d, new Date())
        )));
    }

    public List<Register> getRegistersByCard(Card card) {
        return memory.get(card.getCardNumber());
    }

    public void removeByIndex(Card card, int index) {
        List<Register> registers = memory.get(card.getCardNumber());
        Register reg = registers.remove(index);
        System.out.println(reg.toString() + " Deleted!");
        memory.put(card.getCardNumber(), registers);
    }

    public void deleteCardRegistries(Card card) {
        memory.remove(card.getCardNumber());
    }

    public void addCardRegisters(Card card, List<Register> registers) {
        System.out.println("Associating pending Registers to new Card!");
        memory.put(card.getCardNumber(), registers);
    }
}