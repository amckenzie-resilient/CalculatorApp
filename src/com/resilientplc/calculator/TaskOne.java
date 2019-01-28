package com.resilientplc.calculator;

import java.util.InputMismatchException;

public class TaskOne extends CalculatorApplication{

    private static int result = 0;

    public static void main(String[] args) {

        int firstNumber, secondNumber;
        String operator;

        System.out.print("\n***************** Task 1 **********************\n");

        System.out.print("\nPlease enter your First number: ");
        firstNumber = checkNumberInput();

        System.out.print("Please enter a valid operation: ");
        operator = checkStringInput();

        System.out.print("Please enter your Second number: ");
        secondNumber = checkNumberInput();

        System.out.print("First Number : " + firstNumber);
        System.out.print("\nOperation :  " + operator);
        System.out.print("\nSecond Number : " + secondNumber);

        result = returnResult(firstNumber, operator, secondNumber);

        // Display the Result
        System.out.print("\nResult : " + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result + "\n");
    }

    private static int checkNumberInput()
    {
        int val = 0;

        try{
            val = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.print("Please enter a valid number!\n");
            input.next();
        }

        return val;
    }

    private static String checkStringInput()
    {
        String value = "";

        try {
            value = input.next();

            if (value.contentEquals("help")) {

                menu.help();
            }

        } catch (NumberFormatException e) {
            System.out.print("Incorrect Value Entered!");
            input.nextLine();
            isValid(false);
        }

        return value;
    }

    private static int returnResult(int firstNumber, String op, int secondNumber)
    {

        switch (op) {
            case "+":
                result = cal.add(firstNumber, secondNumber);
                break;
            case "-":
                result = cal.subtract(firstNumber, secondNumber);
                break;
            case "*":
                result = cal.multiple(firstNumber, secondNumber);
                break;
            case "/":
                result = cal.divide(firstNumber, secondNumber);
                break;
        }

        return result;
    }

    private static boolean isValid(boolean x){

        if(!x){

            System.out.println("Try again! ");
            return false;

        }  else return true;
    }
}
