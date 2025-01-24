package org.viniciusog.patterns.structural.decorator.paymentSystem;

import org.viniciusog.patterns.structural.decorator.paymentSystem.decorators.Split;
import org.viniciusog.patterns.structural.decorator.paymentSystem.model.Payment.InstantPayment;
import org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod.CreditCard;
import org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod.DebitCard;
import org.viniciusog.patterns.structural.decorator.paymentSystem.model.PaymentMethod.PIX;

import java.time.LocalDateTime;

public class Client {

    public static void main(String[] args) {

        CreditCard corporateCard = new CreditCard(
                "1234567",
                "Credit card 1",
                "America Bank",
                LocalDateTime.of(2030, 1, 1, 10, 0, 0));
        new InstantPayment(
                "Vinicius",
                700000d,
                LocalDateTime.of(2026, 1, 1, 10, 0, 0),
                corporateCard,
                "Payment to Vinicius - House sold"
        ).pay();

        // ------------ DebitCard with split example
        DebitCard debitCard = new DebitCard(
                "18172367",
                "Debit card 1",
                "Pedro",
                LocalDateTime.of(2030, 1, 1, 10, 0, 0));

        Split donation = new Split(new InstantPayment(
                "São Carlos Children Hospital",
                200000d,
                LocalDateTime.of(2025, 1, 1, 10, 0, 0),
                debitCard,
                "Donation to Children Hospital and Research Labs"
        ), "Heart Research Labs", 0.6);
        donation.pay();


        // ------------ PIX with split example
        PIX pix = new PIX("ifood_payment_system_pix_key@gmail.com", "Ifood");

        Split orderPayment = new Split(new InstantPayment(
                "Ifood",
                50d,
                LocalDateTime.of(2025, 1, 2, 10, 0, 0),
                pix,
                "Pizza order - Ifood"
        ), "São Carlos Pizzaria", 0.02);
        orderPayment.pay();

    }
}
