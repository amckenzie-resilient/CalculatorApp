package com.resilientplc.calculator;

import Interfaces.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTwo extends CalculatorApplication {

    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);
    private static Menu menu = new CalculatorMenu();

    public static void main(String[] args) {

        String fullExpression;
        System.out.print("\n***************** Task 2 **********************\n");

        try {
            System.out.print("\nPlease enter a full expression\n");
            fullExpression = input.nextLine();


            // Display the Result
            System.out.print("\nResult: " + fullExpression + " = " + cal.singleExpression(fullExpression) + "\n");

        } catch (InputMismatchException e) {
            System.out.print("Please enter a valid number!\n");
            input.next();

        } catch (NumberFormatException e) {
            System.out.print("Incorrect Value Entered!");
            input.nextLine();
        }
    }

}
