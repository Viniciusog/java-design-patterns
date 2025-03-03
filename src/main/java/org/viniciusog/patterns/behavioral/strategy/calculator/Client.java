package org.viniciusog.patterns.behavioral.strategy.calculator;

import org.viniciusog.patterns.behavioral.strategy.calculator.strategies.AdditionOperation;
import org.viniciusog.patterns.behavioral.strategy.calculator.strategies.DivisionOperation;
import org.viniciusog.patterns.behavioral.strategy.calculator.strategies.MultiplicationOperation;
import org.viniciusog.patterns.behavioral.strategy.calculator.strategies.SubtractionOperation;

public class Client {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(10, 2);
        System.out.println(calculator.getResult(new DivisionOperation()));
        System.out.println(calculator.getResult(new AdditionOperation()));
        System.out.println(calculator.getResult(new SubtractionOperation()));
        System.out.println(calculator.getResult(new MultiplicationOperation()));
    }
}
