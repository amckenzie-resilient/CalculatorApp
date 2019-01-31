package com.resilientplc.calculator.task;


public class TaskTwo extends CalculatorApp {

    private String fullExpression;
    private int firstNumber;
    private int secondNumber;

    private String menuSelection = "";

    @Override
    public void showQuestion() {

        String[] expression;
        String delimiter;

        System.out.print("\n***************** Task 2 **********************\n");

        //checkMenuSelectionInput();

        System.out.print("\nPlease enter an expression of type number operator number\n");

        try {
            setExpression();

        } catch (Exception e) {
            System.out.print("Error please !");
        }

        delimiter = getDelimiter(getExpression());
        expression = splitString(fullExpression, delimiter);

        setOperator();

        int array_length = expression.length;

        for (int i = 0; i < array_length; i++) {
            if (i == 0) {
                firstNumber = Integer.parseInt(expression[i]);
            }
            if (i == 1) {
                secondNumber = Integer.parseInt(expression[i]);
            }
        }

        result = setResult();

        // Display the Result
        System.out.print("\nResult: " + getExpression() + " = " + result + "\n");
    }

    @Override
    public void setOperator() {
        operator = findOperator(getExpression());
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
        } else if (input.hasNextLine() == "start".contentEquals(menuSelection)) {
            System.out.print("Hello!: ");
        }
    }

    private String getDelimiter(String str) {

        if (str.contains("+")) {
            str = "\\++";
        } else if (str.contains("-")) {
            str = "\\-+";
        } else if (str.contains("*")) {
            str = "\\*+";
        } else if (str.contains("/")) {
            str = "\\/+";
        }

        return str;
    }

    private static String[] splitString(String string, String delimiter) {

        String[] result = string.split(delimiter);

        int array_length = result.length;

        for (int i = 0; i < array_length; i++) {
            result[i] = result[i].trim();
        }

        return result;
    }

    private void setExpression() {
        fullExpression = input.nextLine();
    }

    private String getExpression() {
        return fullExpression;
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

    private int getFirstNumber() {
        return firstNumber;
    }

    private int getSecondNumber() {
        return secondNumber;
    }

    private int setResult() {

        switch (getOperator()) {
            case "+":
                result = cal.add(getFirstNumber(), getSecondNumber());
                break;
            case "-":
                result = cal.subtract(getFirstNumber(), getSecondNumber());
                break;
            case "*":
                result = cal.multiple(getFirstNumber(), getSecondNumber());
                break;
            case "/":
                result = cal.divide(getFirstNumber(), getSecondNumber());
                break;
        }
        return result;
    }

}
