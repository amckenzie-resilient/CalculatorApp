package com.resilientplc.calculator.Tasks;

import com.resilientplc.calculator.CalculatorApplication;

import java.util.InputMismatchException;

public class TaskOne extends CalculatorApplication {

    private static int result = 0;

    @Override
    public void question(){

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

    public String checkStringInput() {
        String value = "";
        boolean invalid = true;

        while (invalid) {

            try {

                value = input.next();

                if (help(value)) {
                    menu.help();
                    System.out.print("Please enter a valid operation:");
                    invalid = true;
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






