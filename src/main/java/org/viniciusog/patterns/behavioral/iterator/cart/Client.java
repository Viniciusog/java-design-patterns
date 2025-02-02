package org.viniciusog.patterns.behavioral.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {

    public static void main(String[] args) {

        Cart cart = new Cart(
                new Product("Suco", 12.99),
                new Product("Bolo", 46.99),
                new Product("Refrigerante", 8.99));

        Double sum = 0d;
        for (Product product : cart) {
            sum += product.getValue();
        }

        System.out.println("Total sum: " + sum);

        // with stream
        Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
        Double sum2 = stream.reduce(0d, (accumulator, prod) -> accumulator + prod.getValue(),
                Double::sum);
        System.out.println("Total sum2: " + sum2);
    }
}
