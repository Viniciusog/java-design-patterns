package org.viniciusog.patterns.behavioral.template.sales.service.template;

import org.viniciusog.patterns.behavioral.template.sales.model.Cart;

import java.time.LocalDate;
import java.time.Month;

public class BlackFriday extends BestOfferTemplate {

    public BlackFriday(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        LocalDate localDate = LocalDate.now();
        return localDate.getMonth() == Month.NOVEMBER;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.75d;
    }
}
