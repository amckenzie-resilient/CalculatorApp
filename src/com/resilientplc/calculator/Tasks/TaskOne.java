package com.resilientplc.calculator.Tasks;

import com.resilientplc.calculator.Calculations.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne extends CalculatorApp {

    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;
    private String operator;
    private int result = 0;

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

            displayResult();

            result = setResult();

            // Display the Result
            System.out.print("Result : " + " " + getFirstNumber() + " " + getOperator() + " " + getSecondNumber() + " = " + getResult() + "\n");

        } catch (InputMismatchException e) {
            System.out.print("Not a number, please try again!");
        } catch (NumberFormatException e) {
            System.out.print("Not a valid operator, please try again!");
        }
    }

    @Override
    public String getOperator()
    {
        return operator;
    }

    @Override
    public void setOperator()
    {
        operator = input.next();
    }

    @Override
    public int getResult()
    {
        return result;
    }

    private void displayResult()
    {
        System.out.print("First Number : " + getFirstNumber() + "\n");
        System.out.print("Operator : " + getOperator() + "\n");
        System.out.print("Second Number : " + getSecondNumber() + "\n" + "\n");
    }

    private void setFirstNumber() throws InputMismatchException
    {
        firstNumber = input.nextInt();
    }

    private void setSecondNumber() throws InputMismatchException
    {
      secondNumber = input.nextInt();
    }

    private int getFirstNumber()
    {
        return firstNumber;
    }

    private int getSecondNumber()
    {
        return secondNumber;
    }

    private int setResult() {

        switch (getOperator()) {
            case "+":
                result = cal.add(getFirstNumber(),getSecondNumber());
                break;
            case "-":
                result = cal.subtract(getFirstNumber(),getSecondNumber());
                break;
            case "*":
                result = cal.multiple(getFirstNumber(),getSecondNumber());
                break;
            case "/":
                result = cal.divide(getFirstNumber(), getSecondNumber());
                break;
        }
        return result;
    }

}