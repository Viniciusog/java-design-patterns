package org.viniciusog.patterns.behavioral.strategy.calculator;

import org.viniciusog.patterns.behavioral.strategy.calculator.strategies.OperationStrategy;

public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num2 = num2;
        this.num1 = num1;
    }

    public int getResult(OperationStrategy strategy) {
        return strategy.calculate(num1, num2);
    }
}