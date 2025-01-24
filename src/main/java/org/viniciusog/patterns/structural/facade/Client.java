package org.viniciusog.patterns.structural.facade;

import org.viniciusog.patterns.structural.facade.facade.CallCenterFacade;
import org.viniciusog.patterns.structural.facade.model.Card;

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
    }
}
