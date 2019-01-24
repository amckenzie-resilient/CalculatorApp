package com.resilientplc.calculator;

public class Calculator {

    public int Add (int x, int y){
        return x + y;
    }

    public int Subtract(int x, int y){
        return x - y;
    }

    public int Multiple(int x, int y){
        return x * y;
    }

    public int Divide(int x, int y){ return x / y; }

    public int SingleExpression (String expression){

        int x,y,result = 0;
        String op;
        Calculator cal =  new Calculator();

        String[] parts = expression.split("\\s+");

        x = Integer.parseInt(parts[0]);
        op = parts[1];
        y = Integer.parseInt(parts[2]);

        switch (op) {
            case "+":
                result = cal.Add(x, y);
                break;
            case "-":
                result = cal.Subtract(x, y);
                break;
            case "*":
                result = cal.Multiple(x, y);
                break;
            case "/":
                result = cal.Divide(x, y);
                break;
            default:
                System.out.print("Invalid Operation Selected");
                break;
        }

        return result;
    }

}
