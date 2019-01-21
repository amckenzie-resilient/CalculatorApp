package com.resilientplc.calculator;

public class Calculator {

    public int add (int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiple(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){ return x / y; }

    public int expression (String operator){

        int result = 0;
        System.out.print(operator);
/*
        switch (operator)
        {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
        }
*/
        return result;
    }

}
