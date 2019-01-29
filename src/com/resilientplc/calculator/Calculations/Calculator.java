package com.resilientplc.calculator.Calculations;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public int multipleExpression(String expression){

        int result = 0;
        Pattern pattern = Pattern.compile("\\*+");
        Matcher matcher = pattern.matcher(expression);
        boolean multiple = matcher.find();
        String answer = "";

        List x = new ArrayList<String>();

        if (multiple) {

            String[] parts = expression.split("\\*+", 2);
            for (String a : parts)
            {
                //x.add(a);
            }

            //System.out.print(x[0]);

            /*
            for (int i = 0, n = expression.length(); i < n; i++) {

               x = padLeft(parts[i],-1);
               //System.out.print("Inside Loop" + x);

               //result += Integer.parseInt(x);
               // System.out.print("Inside Loop" + x);
            }*/

        } else {
            System.out.print("False");
        }

        System.out.print("What is the result" + answer);

        return result;
    }

    public int singleExpression (String expression){

        int x,y,result = 0;
        String op;
        Calculator cal =  new Calculator();

        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(expression);
        boolean spaceFound = matcher.find();

        if (spaceFound) {

            String[] parts = expression.split("\\s+");
            x = Integer.parseInt(parts[0]);
            op = parts[1];
            y = Integer.parseInt(parts[2]);

        } else {

            x = Character.getNumericValue(expression.charAt(0));
            op = Character.toString(expression.charAt(1));
            y = Character.getNumericValue(expression.charAt(2));
        }

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

    public boolean IsNumber(String str){

        if( str.contains("+") || str.contains("-") || str.contains("*") || str.contains("/"))
        {
            return false;
        }

        return true;
    }

}
