package com.resilientplc.calculator;
import Interfaces.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApplication {

    static int state = 1;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        Menu menu = new CalculatorMenu();
        Calculator cal = new Calculator();          // a new calculator object for calculations

        boolean running = true;

        try {

            menu.CreateMenu();

                while(running) {

                    switch (state) {
                        case 1:
                        TaskOne(input, cal);
                        break;

                        case 2:
                        TaskTwo(input, cal);
                        break;

                        case 3:
                        TaskThree();
                        break;

                        case 4:
                        menu.Help();
                        break;

                        case 5:
                        menu.Exit();
                        break;
                    }
                }
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

        int firstNumber = 0, secondNumber = 0, result = 0;
        String operation = "";

        System.out.print("\nPlease enter your First number: ");
        firstNumber = input.nextInt();

        System.out.print("Please enter a valid operation: ");
        operation = input.next();

        System.out.print("Please enter your Second number: ");
        secondNumber = input.nextInt();

        String firstNum = String.format("First Number : " + firstNumber);
        String op = String.format("\nOperation :  " +  operation);
        String secondNum = String.format("\nSecond Number : " +  secondNumber);
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

        state = 2;
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
