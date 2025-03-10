package org.viniciusog.patterns.behavioral.template.sales.service;

import org.viniciusog.patterns.behavioral.template.sales.model.Cart;
import org.viniciusog.patterns.behavioral.template.sales.service.template.*;

import java.util.ArrayList;
import java.util.List;

public class BestOfferService {

    private List<BestOfferTemplate> templates;

    private void loadTemplates(Cart cart) {
        templates = new ArrayList<BestOfferTemplate>();
        templates.add(new RegularPrice(cart));
        templates.add(new FreeDelivery(cart));
        templates.add(new BigCartDiscounts(cart));
        templates.add(new SpecialClient(cart));
        templates.add(new CategoryDiscounts(cart));
        templates.add(new BlackFriday(cart));
    }


    public void calculateBestOffer(Cart cart) {
        loadTemplates(cart);
        Double bestOffer = Double.MAX_VALUE;
        for(BestOfferTemplate template: templates) {
            if(template.isAppliable()) {
                Double currentPrice = template.calculateOffer(cart);
                System.out.println(String.format("%s: %.2f",
                                template.getClass().getSimpleName(),
                                currentPrice));
                bestOffer = (bestOffer > currentPrice) ? currentPrice: bestOffer;
            }
        }
        System.out.println(String.format("final Price: %.2f", bestOffer));
    }
}