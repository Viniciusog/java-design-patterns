package org.viniciusog.patterns.behavioral.template.sales.service.template;

import org.viniciusog.patterns.behavioral.template.sales.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {
    public BigCartDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return regularItemsPrice > 1000;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.9d;
    }
}
