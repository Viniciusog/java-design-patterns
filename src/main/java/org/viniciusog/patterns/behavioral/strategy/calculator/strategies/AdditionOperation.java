package org.viniciusog.patterns.behavioral.strategy.calculator.strategies;

public class AdditionOperation implements OperationStrategy {
    @Override
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
}
