package com.resilientplc.calculator;
import Interfaces.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        Menu menu = new CalculatorMenu();

        int val1 = 0, val2 = 0, result = 0;

        String fullExpression = "";

        String operation = "";                      // capture operation input from the
        Calculator cal = new Calculator();          // a new calculator object for calculations
        boolean mainCalculator = true;              // while the app is open
        boolean helpMenu = menu.IsActive();

        while (mainCalculator) {

            menu.CreateMenu();

            try {

                System.out.print("\nPlease enter your First number: ");

                if (input.hasNext("help")){
                    mainCalculator = false;
                    break;
                }else if (input.hasNext("exit")){
                    mainCalculator = false;
                    break;
                }else {
                    val1 = input.nextInt();
                }

                System.out.print("Please enter a valid operation: ");
                if (input.hasNext("help")) {
                    mainCalculator = false;
                    break;
                }else if (input.hasNext("exit")){
                    mainCalculator = false;
                    break;
                } else {
                    operation = input.next();
                }

                System.out.print("Please enter your Second number: ");

                if (input.hasNext("help")){
                    mainCalculator = false;
                   // menu.IsActive();
                    break;
                }else if (input.hasNext("exit")){
                    mainCalculator = false;
                    break;
                }else {
                    val2 = input.nextInt();
                }

                switch (operation) {
                    case "+":
                        result = cal.add(val1, val2);
                        break;
                    case "-":
                        result = cal.subtract(val1, val2);
                        break;
                    case "*":
                        result = cal.multiple(val1, val2);
                        break;
                     case "/":
                        result = cal.divide(val1, val2);
                        break;
                     default:
                        System.out.print("Invalid Operation Selected");
                        break;
                    }

               //Display the first number value entered by the user
               System.out.print("\nFirst Number : " + val1 + "\n");

               // Display operation
               System.out.print("Operation : " + operation + "\n");

               //Display the second number value entered by the user
               System.out.print("Second Number : " + val2 + "\n");

               // Display the Result
               System.out.print("\nResult : " + " " + val1 + " " + operation + " " + val2 + " = " + result + "\n");

               // Enter a full Expression Task 2
               System.out.print("\n***************** Task 2 **********************\n");

               System.out.print("\nPlease enter a full expression\n");
               fullExpression = in.nextLine();

                // Display the Result
                System.out.print("\nResult: " + fullExpression + " = " +  cal.expression(fullExpression) + "\n");
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

        while (helpMenu) {

            menu.Help();
            helpMenu = menu.IsInactive();

        }
    }

}
