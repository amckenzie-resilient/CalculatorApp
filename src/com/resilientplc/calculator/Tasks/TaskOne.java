package com.resilientplc.calculator.Tasks;

import com.resilientplc.calculator.Calculations.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne extends CalculatorApp {

    private static int result = 0;
    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;
    private String operator;

    @Override
    public void showQuestion() {

        System.out.print("\n***************** Task 1 **********************\n");

        System.out.print("\nPlease enter your First number: ");

        try {
            setFirstNumber();
            System.out.print("Please enter a valid operator: ");
            setOperator();

            System.out.print("Please enter your Second number: ");
            setSecondNumber();

            System.out.print("First Number : " + getFirstNumber() + "\n");
            System.out.print("Operator : " + getOperator() + "\n");
            System.out.print("Second Number : " + getSecondNumber() + "\n" + "\n");

            result = getResult(getFirstNumber(), getOperator(), getSecondNumber());

            // Display the Result
            System.out.print("Result : " + " " + getFirstNumber() + " " + getOperator() + " " + getSecondNumber() + " = " + result + "\n");

        }catch ( InputMismatchException e){
            System.out.print("Not a number, please try again!");
        }catch ( NumberFormatException e){
            System.out.print("Not a valid operator, please try again!");
        }

    }

    private void setFirstNumber() throws InputMismatchException
    {
        firstNumber = input.nextInt();
    }

    private void setSecondNumber() throws InputMismatchException
    {
      secondNumber = input.nextInt();
    }

    private void setOperator()
    {
      operator = input.next();
    }

    private int getFirstNumber()
    {
        return firstNumber;
    }

    private int getSecondNumber()
    {
        return secondNumber;
    }

    private String getOperator()
    {
        return operator;
    }

    private static int getResult(int x, String op, int y) {

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
        }

        return result;
    }
}