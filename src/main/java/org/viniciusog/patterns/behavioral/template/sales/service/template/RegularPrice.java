package org.viniciusog.patterns.behavioral.template.sales.service.template;

import org.viniciusog.patterns.behavioral.template.sales.model.Cart;

public class RegularPrice extends BestOfferTemplate {

    public RegularPrice(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        // nothing to adjust, variables stay as 1d!
    }
}