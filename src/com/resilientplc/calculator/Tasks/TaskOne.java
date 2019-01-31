package com.resilientplc.calculator.Tasks;

import com.resilientplc.calculator.Calculations.Calculator;
import com.resilientplc.calculator.ExceptionHandling.OperatorInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne extends CalculatorApp {

    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);

    private int firstNumber;
    private int secondNumber;

    @Override
    public void showQuestion() {

        int count = 0;

        System.out.print("\n***************** Task 1 **********************\n");

        do {

            if(count == 0) {
                System.out.print("\nPlease enter your First number: ");

                try {
                    setFirstNumber();
                    count = 1;

                } catch (Exception e) {
                    System.out.print("Please enter a integer");
                    count = 0;
                }
            }

            if(count == 1)
            {
                System.out.print("Please enter a valid operator: ");

                try {
                    setOperator();
                } catch (OperatorInputException e) {
                    System.out.print(e.getMessage());
                }

                System.out.print("Please enter your Second number: ");
                try {
                    setSecondNumber();
                } catch (Exception e) {
                    System.out.print("Please enter a integer");
                }
            }
        }while(count < 3);

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
            throw new OperatorInputException("Wrong operator type entered!!!");
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