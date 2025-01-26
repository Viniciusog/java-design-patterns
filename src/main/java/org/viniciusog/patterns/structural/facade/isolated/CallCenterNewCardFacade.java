package org.viniciusog.patterns.structural.facade.isolated;

import org.viniciusog.patterns.structural.facade.model.Card;
import org.viniciusog.patterns.structural.facade.model.Register;
import org.viniciusog.patterns.structural.facade.services.*;

import java.util.Arrays;
import java.util.Date;

public class CallCenterNewCardFacade {

    private CardService cardService;
    private RegisterService registerService;
    private SecurityService securityService;
    private ReportService reportService;


    public CallCenterNewCardFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        securityService = new SecurityService(cardService, registerService);
        reportService = new ReportService(registerService);
    }

    public void addRegistry(Long user, String storeName, Double value, Date date) {
        Register register = new Register(storeName, value, date);
        Card card = cardService.getCardByUser(user);
        registerService.addCardRegisters(card, Arrays.asList(register));
    }

    public Long orderNewCard(Long user) {
        Long card = cardService.createNewCard(user, 765431L).getCardNumber();
        return card;
    }

    public void cancelCard(Long user) {
        Card card = cardService.getCardByUser(user);
        securityService.blockCard(card);
    }

    public void deleteCardRegistries(Long user) {
        Card card = cardService.getCardByUser(user);
        registerService.deleteCardRegistries(card);
    }

    public void getSummary(Long user) {
        Card card = cardService.getCardByUser(user);
        reportService.getSummary(card);
    }
}


