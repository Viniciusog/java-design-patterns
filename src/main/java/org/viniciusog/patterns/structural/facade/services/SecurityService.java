package org.viniciusog.patterns.structural.facade.services;

import org.viniciusog.patterns.structural.facade.model.Card;
import org.viniciusog.patterns.structural.facade.model.Register;

import java.util.List;

public class SecurityService {

    private CardService cardService;
    private RegisterService registerService;

    public SecurityService(CardService cardService, RegisterService registerService) {
        this.cardService = cardService;
        this.registerService = registerService;
    }

    public List<Register> blockCard(Card card) {
        System.out.println("Blocking card: " + card);
        List<Register> pendingRegisters = registerService.getRegistersByCard(card);
        registerService.deleteCardRegistries(card);
        cardService.removeCard(card);
        return pendingRegisters;
    }
}