package com.resilientplc.calculator.task;

import com.resilientplc.calculator.calculation.Calculator;
import com.resilientplc.calculator.exceptionHandling.OperatorInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne extends CalculatorApp {

    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;

    @Override
    public void showQuestion() {

        boolean count = false;
        int num = 0;

        System.out.print("\n***************** Task 1 **********************\n");

            while (!count) {

                System.out.print("\nPlease enter your First number: ");
                try {
                      setFirstNumber();
                      count = true;

                } catch (Exception e) {
                    System.out.print("Please enter a valid number!!!");
                    input.next();
                }
            }

            count = false;

            while (!count) {
                System.out.print("\nPlease enter a valid operator: ");

                try {
                    setOperator();
                    count = true;
                } catch (OperatorInputException e) {
                    System.out.print(e.getMessage());
                    input.nextLine();
                }
            }

            count = false;

            while (!count) {

                System.out.print("\nPlease enter your Second number: ");
                try {
                    setSecondNumber();
                    count = true;
                } catch (Exception e) {
                    System.out.print("Please enter a integer");
                    input.next();
                }
            }

            displayValuesReturned();

            result = setResult();

            // Display the Result
            System.out.print("Result : " + " " + getFirstNumber() + " " + getOperator() + " " + getSecondNumber() + " = " + getResult() + "\n");

    }

    @Override
    public void setOperator() throws OperatorInputException
    {
        operator = input.next();

        if (!"+".contentEquals(operator) && (!"-".contentEquals(operator)) && (!"*".contentEquals(operator))
        && (!"/".contentEquals(operator))) {
            throw new OperatorInputException(" Please enter a valued operator type!");
        }
    }

    private void displayValuesReturned()
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

    private int getFirstNumber(){ return firstNumber;}

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