package com.resilientplc.calculator.Tasks;

import com.resilientplc.calculator.Calculations.Calculator;
import com.resilientplc.calculator.ExceptionHandling.NumberInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne extends CalculatorApp {

    private static int result = 0;
    private static Calculator cal = new Calculator();
    public static Scanner input = new Scanner(System.in);

    @Override
    public void showQuestion(){

        int firstNumber, secondNumber;
        String operator;

        System.out.print("\n***************** Task 1 **********************\n");

        System.out.print("\nPlease enter your First number: ");

        firstNumber = checkNumberInput();
        System.out.print("Please enter a valid operator: ");
        operator = checkStringInput();

        System.out.print("Please enter your Second number: ");
        secondNumber = checkNumberInput();

        System.out.print("First Number : " + firstNumber);
        System.out.print("\nOperator :  " + operator);
        System.out.print("\nSecond Number : " + secondNumber);

        result = returnResult(firstNumber, operator, secondNumber);

        // Display the Result
        System.out.print("\nResult : " + " " + firstNumber + " " + operator + " " + secondNumber + " = " + result + "\n");
    }

    private static int returnResult(int x, String op, int y)
    {
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
                result = cal.divide(x, 7);
                break;
        }
        return result;
    }
/*
    public int checkNumberInput(int val) throws NumberInputException
    {
        if (val != (int)val)
        {
            throw new NumberInputException("Please enter a valid number!" + val);
        }else {
            val = input.nextInt();
        }

        return val;
    }
 */

    public int checkNumberInput()
    {
        int val = 0;
        boolean invalid = true;

        while (invalid){

            try{
                val = input.nextInt();
                invalid = false;

            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid number!\n");
                invalid = true;
                input.next();
            }
        }
        return val;
    }


    public static String checkStringInput() {
        String value = "";
        boolean invalid = true;

        while (invalid) {

            try {

                value = input.next();

                if (help(value)) {
                    menu.help();
                    System.out.print("Please enter a valid operation:");
                    invalid = true;
                } else if (exit(value)){
                    menu.exit();
                } else if (value.contentEquals("+") || value.contentEquals("-") || value.contentEquals("*") || value.contentEquals("/")) {
                    invalid = false;
                } else {
                    invalid = true;
                    System.out.print("Please enter a valid operator:");
                }

            } catch (NumberFormatException e) {
                System.out.print("Incorrect Value Entered!");
                invalid = true;
                input.nextLine();
            }
        }

        return value;
    }
}






