package com.resilientplc.calculator.task;

import java.util.Scanner;

public class TaskThree extends CalculatorApp {

    private String fullExpression;
    private String menuSelection;

    @Override
    public void showQuestion() {

        String[] expression;
        String delimiter;

        System.out.print("\n***************** Task 3 **********************\n");

        checkMenuSelectionInput();

        System.out.print("\nPlease enter a full mathematical operation\n");

        try {
            setExpression();
        } catch (Exception e) {
            System.out.print("Error!");
        }

        System.out.print(fullExpression);


        //delimiter = getDelimiter(getExpression());
        //setOperator();
        //System.out.print("operators" + operator );

        //result = cal.multipleExpression(mathematicalOp);
    }


    @Override
    public void setOperator() {
        operator = findOperator(getExpression());
    }

    @Override
    public void checkMenuSelectionInput() {

        menuSelection = input.next();
        if (input.hasNextLine() == "help".contentEquals(menuSelection)) {
            menu.help();
        } else if (input.hasNextLine() == "exit".contentEquals(menuSelection)) {
            menu.exit();
        } else if (input.hasNextLine() == "reset".contentEquals(menuSelection)) {
            menu.reset();
        }

    }

    private void setExpression() {
        fullExpression = input.nextLine();
    }

    private String getExpression() {
        return fullExpression;
    }

    private static String[] splitString(String string, String delimiter) {

        String[] result = string.split(delimiter);

        int array_length = result.length;

        for (int i = 0; i < array_length; i++) {
            result[i] = result[i].trim();
        }

        return result;
    }

    public String findOperator(String str) {
        if (str.contains("+")) {
            str = "+";
        } else if (str.contains("-")) {
            str = "-";
        } else if (str.contains("*")) {
            str = "*";
        } else if (str.contains("/")) {
            str = "/";
        }

        return str;
    }

}
