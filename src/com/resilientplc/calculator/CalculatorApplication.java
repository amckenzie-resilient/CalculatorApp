package com.resilientplc.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int val1 = 0, val2 = 0, result = 0;

        String operation;                       // capture operation input from the user
        Calculator cal = new Calculator();      //  a new calculator object for calculations

        boolean open = true;                    // while the app is open

        while (open) {

            // Enter first number
            try {
                System.out.print("\nPlease enter your First number: ");
                val1 = input.nextInt();
            }
            catch (InputMismatchException e ){
                System.out.print("\nPlease enter a valid number!!!\n");
                input.nextLine();
            }

            // Select operation type
            System.out.print("Please enter a valid operation: ");
            operation = input.next();

            // Enter second number
            try {
                System.out.print("Please enter your Second number: ");
                val2 = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.print("Please enter a valid number!!!\n");
                input.nextLine();
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
                    //result = 0;
                    System.out.print("Invalid Operation Selected");
                    break;
            }

            //Display the first number values entered by the user
            System.out.print("\nFirst Number : " + val1 + "\n");

            // Display operation
            System.out.print("Operation : " + operation + "\n");

            System.out.print("Second Number : " + val2 + "\n");

            // Display the Result
            System.out.print("\nResult : " + " " + val1 + " " + operation + " " + val2 + " = " + result + "\n");

        }
    }

}
