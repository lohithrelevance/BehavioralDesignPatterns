package com.lohith.pattern.stratergy;

public class Manager implements Strategy{

    private Strategy strategy;  // Composition and Coding to supertype/interface

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        this.strategy.operation(num1,num2);
    }
}
