package com.resilientplc.calculator.task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThree extends CalculatorApp {

    private String expression;
    private String menuSelection;

    @Override
    public void showQuestion() {

        String delimiter;

        System.out.print("\n***************** Task 3 **********************\n");

        System.out.print("\nPlease enter a full mathematical operation\n");

        try {
            setExpression();
        } catch (Exception e) {
            System.out.print("Error attempting to set ");
        }

        System.out.print(expression);

        findOperator(expression);

    }


    @Override
    public void setOperator() {

    }

    @Override
    public void checkMenuSelectionInput() {

        menuSelection = input.nextLine();
        if (input.hasNextLine() == "help".contentEquals(menuSelection)) {
            menu.help();
        } else if (input.hasNextLine() == "exit".contentEquals(menuSelection)) {
            menu.exit();
        } else if (input.hasNextLine() == "reset".contentEquals(menuSelection)) {
            menu.reset();
        }

    }

    private void setExpression() {
        expression = input.nextLine();
    }

    private String getExpression() {
        return expression;
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

        Pattern pattern = Pattern.compile("\\*+");
        Matcher matcher = pattern.matcher(expression);

        boolean multiple = matcher.find();

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
