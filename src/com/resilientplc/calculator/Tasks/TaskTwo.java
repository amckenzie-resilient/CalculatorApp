package com.resilientplc.calculator.Tasks;
import com.resilientplc.calculator.Calculations.Calculator;

public class TaskTwo extends CalculatorApp {

    private String fullExpression;
    private String operator;

    private static Calculator cal = new Calculator();
    private int firstNumber;
    private int secondNumber;
    private int result = 0;

    @Override
    public void showQuestion() {

        System.out.print("\n***************** Task 2 **********************\n");

        System.out.print("\nPlease enter a full expression\n");

        try {
            setFullExpression();
        }catch (Exception e){
            System.out.print("Error!");
        }

        //splitString(fullExpression);

        //System.out.print("What is the first number: " + firstNumber);
        //System.out.print("What is the second number: " + secondNumber);

        //result = setResult();

        // Display the Result
        //System.out.print("\nResult: " + getFullExpression() + " = " + cal.singleExpression(getFullExpression()) + "\n");
    }

    @Override
    public void setOperator()
    {
        operator = findOperator(getFullExpression());
    }

    @Override
    public String getOperator()
    {
        return operator;
    }

    @Override
    public int getResult()
    {
        return result;
    }

    private void splitString(String s){

        String[] parts = s.split("\\d+");

        firstNumber = Integer.parseInt(parts[0]);
        secondNumber = Integer.parseInt(parts[2]);
    }

    private void setFullExpression(){
        fullExpression = input.nextLine();
    }

    private String getFullExpression()
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

}
