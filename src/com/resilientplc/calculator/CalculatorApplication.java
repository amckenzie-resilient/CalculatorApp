package com.resilientplc.calculator;
import Interfaces.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        Menu menu = new CalculatorMenu();
        Calculator cal = new Calculator();          // a new calculator object for calculations

        try {

            menu.CreateMenu();

            TaskOne(input, cal);
            TaskTwo(in,cal);

            TaskThree(); // to implement
        }

        catch (InputMismatchException e){

            System.out.print("Please enter a valid number!\n");
            input.next();
        }

        catch (NumberFormatException e){
            System.out.print("Incorrect Value Entered!");
            in.nextLine();
        }
    }

    public static void TaskOne(Scanner input, Calculator cal){

        int firstNumber, secondNumber, result = 0;
        String operation;

        System.out.print("\nPlease enter your First number: ");
        firstNumber = input.nextInt();

        System.out.print("Please enter a valid operation: ");
        operation = input.next();

        System.out.print("Please enter your Second number: ");
        secondNumber = input.nextInt();

        //Display the first number value entered by the user
        System.out.print("\nFirst Number : " + firstNumber + "\n");

        // Display operation
        System.out.print("Operation : " + operation + "\n");

        //Display the second number value entered by the user
        System.out.print("Second Number : " + secondNumber + "\n");


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

        // Display the Result
        System.out.print("\nResult : " + " " + firstNumber + " " + operation + " " + secondNumber + " = " + result + "\n");

    }

    public static void TaskTwo(Scanner in, Calculator cal){

        String fullExpression;

        // Enter a full Expression Task 2
        System.out.print("\n***************** Task 2 **********************\n");

        System.out.print("\nPlease enter a full expression\n");
        fullExpression = in.nextLine();

        // Display the Result
        System.out.print("\nResult: " + fullExpression + " = " +  cal.expression(fullExpression) + "\n");

    }

    public static void TaskThree(){

    }

}
