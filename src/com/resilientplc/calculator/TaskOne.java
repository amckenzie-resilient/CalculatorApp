package com.resilientplc.calculator;

import Interfaces.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);
    private static Menu menu = new CalculatorMenu();

    public static void main(String[] args) {

        int firstNumber = 0, secondNumber = 0;
        String operation = "";
        int result = 0;

        menu.CreateMenu();

        System.out.print("\n***************** Task 1 **********************\n");

        try {
            System.out.print("\nPlease enter your First number: ");
            firstNumber = input.nextInt();

            System.out.print("Please enter a valid operation: ");
            operation = input.next();

            System.out.print("Please enter your Second number: ");
            secondNumber = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.print("Please enter a valid number!\n");
            input.next();
        } catch (NumberFormatException e) {
            System.out.print("Incorrect Value Entered!");
            input.nextLine();
        }

        String firstNum = String.format("First Number : " + firstNumber);
        String op = String.format("\nOperation :  " + operation);
        String secondNum = String.format("\nSecond Number : " + secondNumber);
        //String finalResult = String.format("\nResult : " + " "  + firstNumber + " " + operation + " " + secondNumber + " = " + result + "\n");

        switch (operation) {
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
            default:
                System.out.print("Invalid Operation Selected");     // need to change this!
                break;
        }

        //Display the first number value entered by the user
        System.out.print(firstNum);

        // Display operation
        System.out.print(op);

        //Display the second number value entered by the user
        System.out.print(secondNum);

        // Display the Result
        //System.out.print(finalResult);
        System.out.print("\nResult : " + " " + firstNumber + " " + operation + " " + secondNumber + " = " + result + "\n");
    }
}
