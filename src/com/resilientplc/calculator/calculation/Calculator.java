package com.resilientplc.calculator.calculation;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiple(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {

        if (x == 0) {
            throw new IllegalArgumentException("Argument cannot be divided by zero!");
        }
        return x / y;
    }

}
