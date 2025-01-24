package org.viniciusog.patterns.structural.facade.services;

import org.viniciusog.patterns.structural.facade.model.Card;

import java.util.HashMap;
import java.util.Map;
import java.util.spi.CalendarDataProvider;

public class CardService {

    private Map<Long, Card> memory;

    public CardService() {
        memory = new HashMap<>();
        memory.put(123456L, new Card(123456L, 55555L));
    }

    public Card getCardByUser(Long user) {
        return memory.get(user);
    }

    public void removeCard(Card card) {
        memory.remove(card.getUserNumber());
    }

    public Card createNewCard(Long user, Long cardNumber) {
        Card card = memory.put(user, new Card(user, cardNumber));
        System.out.println("Creating new card: " + card);
        return card;
    }
}