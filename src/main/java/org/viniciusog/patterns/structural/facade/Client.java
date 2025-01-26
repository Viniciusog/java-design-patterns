package org.viniciusog.patterns.structural.facade;

import org.viniciusog.patterns.structural.facade.facade.CallCenterFacade;
import org.viniciusog.patterns.structural.facade.isolated.CallCenterNewCardFacade;
import org.viniciusog.patterns.structural.facade.model.Card;

import java.util.Date;

public class Client {

    public static void main(String[] args) {

        CallCenterFacade facade = new CallCenterFacade();

        Card card = facade.getCardByUser(123456L);
        System.out.println(card);

        facade.getSummary(card);
        facade.cancelLastRegister(card);
        facade.getSummary(card);

        System.out.println("Payment info:");
        facade.getPaymentInfoByCard(card);


        // using facade without card and register models
        System.out.println("\n-------------");
        CallCenterNewCardFacade callCenterNewCardFacade = new CallCenterNewCardFacade();
        Long cardNumber = callCenterNewCardFacade.orderNewCard(88888L);
        callCenterNewCardFacade.addRegistry(88888L, "Loja esquina", 16d, new Date());
        callCenterNewCardFacade.getSummary(88888L);
        callCenterNewCardFacade.deleteCardRegistries(88888L);
        callCenterNewCardFacade.getSummary(88888L);
    }
}
