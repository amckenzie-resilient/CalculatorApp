package com.resilientplc.calculator;

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
        return x / y;
    }

    public int multipleExpression(String expression) {

        int x, y, result = 0;

        return result;

    }

    public int singleExpression(String expression) {

        int x, y, result = 0;
        String op;
        Calculator cal = new Calculator();

        String[] parts = expression.split("\\s+");
        Integer[] ex;

        x = Integer.parseInt(parts[0]);
        op = parts[1];
        y = Integer.parseInt(parts[2]);

        switch (op) {
            case "+":
                result = cal.add(x, y);
                break;
            case "-":
                result = cal.subtract(x, y);
                break;
            case "*":
                result = cal.multiple(x, y);
                break;
            case "/":
                result = cal.divide(x, y);
                break;
            default:
                System.out.print("Invalid Operation Selected");
                break;
        }

        return result;
    }

    public boolean IsNumber(String str) {

        if (str.contains("+") || str.contains("-") || str.contains("*") || str.contains("/")) {
            return false;
        }

        return true;
    }

}
