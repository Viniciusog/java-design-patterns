package org.viniciusog.patterns.structural.facade.services;

import org.viniciusog.patterns.structural.facade.model.Card;
import org.viniciusog.patterns.structural.facade.model.Register;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private RegisterService registerService;

    public PaymentService(RegisterService registerService) {
        this.registerService = registerService;
    }

    public void getPaymentInfoByCard(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        double sum = registers.stream().reduce(0d,
                (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
        System.out.printf("You have to pay %f until next week.", sum);
    }
}