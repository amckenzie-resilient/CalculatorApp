package com.resilientplc.calculator.Tasks;
import com.resilientplc.calculator.CalculatorApplication;

public class TaskThree extends CalculatorApp {

    private String operator;
    private int result = 0;

    private String mathematicalOp;

    @Override
    public void showQuestion() {


        // Enter a full Expression Task 3
        System.out.print("\n***************** Task 3 **********************\n");

        System.out.print("\nPlease enter a full mathematical operation\n");

        try {
            setMathematicalExpression();
        }catch (Exception e){
            System.out.print("Error!");
        }

        //result = cal.multipleExpression(mathematicalOp);
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

    @Override
    public void setOperator()
    {

    }

    private void setMathematicalExpression(){

        mathematicalOp = input.nextLine();
    }

    private String getMatemticalExpression()
    {
        return mathematicalOp;
    }



}
