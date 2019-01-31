package com.resilientplc.calculator.Tasks;
import com.resilientplc.calculator.Calculations.Calculator;

public class TaskTwo extends CalculatorApp {

    private String fullExpression;
    private int firstNumber;
    private int secondNumber;

    @Override
    public void showQuestion() {

        String [] expression;
        String delimiter;

        System.out.print("\n***************** Task 2 **********************\n");

        System.out.print("\nPlease enter a full expression\n");

        try {
            setExpression();
        }catch (Exception e){
            System.out.print("Error!");
        }

        delimiter = getDelimiter(getExpression());
        expression = splitString(fullExpression, delimiter);
        setOperator();

        firstNumber = Integer.parseInt(expression[0]);
        secondNumber = Integer.parseInt(expression[1]);

        result = setResult();

        // Display the Result
        System.out.print("\nResult: " + getExpression() + " = " + result + "\n");
    }

    @Override
    public void setOperator()
    {
        operator = findOperator(getExpression());
    }

    private String getDelimiter(String str){

        if( str.contains("+")) {
            str = "\\++";
        }else if ( str.contains("-")){
            str = "\\-+";
        }else if ( str.contains("*")){
            str = "\\*+";
        }else if ( str.contains("/")){
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

    private void setExpression(){
        fullExpression = input.nextLine();
    }

    private String getExpression()
    {
        return fullExpression;
    }

    public String findOperator (String str)
    {
        if( str.contains("+")) {
            str = "+";
        }else if ( str.contains("-")){
            str = "-";
        }else if ( str.contains("*")){
            str = "*";
        }else if ( str.contains("/")){
            str = "/";
        }

        return str;
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
