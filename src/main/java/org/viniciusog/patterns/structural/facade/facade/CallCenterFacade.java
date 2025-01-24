package org.viniciusog.patterns.structural.facade.facade;

import org.viniciusog.patterns.structural.decorator.paymentSystem.model.Payment.Payment;
import org.viniciusog.patterns.structural.facade.model.Card;
import org.viniciusog.patterns.structural.facade.model.Register;
import org.viniciusog.patterns.structural.facade.services.*;

import java.util.List;

public class CallCenterFacade {

    private CardService cardService;
    private RegisterService registerService;
    private PaymentService paymentService;
    private ReportService reportService;
    private SecurityService securityService;


    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
        securityService = new SecurityService(cardService, registerService);
    }

    public Card getCardByUser(Long user) {
        return cardService.getCardByUser(user);
    }


    public void getSummary(Card card) {
        reportService.getSummary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        paymentService.getPaymentInfoByCard(card);
    }

    public void cancelLastRegister(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        int indexLastRegister = registers.size() - 1;
        registerService.removeByIndex(card, indexLastRegister);
    }

}
