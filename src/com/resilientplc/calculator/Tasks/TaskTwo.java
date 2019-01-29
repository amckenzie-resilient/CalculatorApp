package com.resilientplc.calculator.Tasks;
import com.resilientplc.calculator.CalculatorApplication;

public class TaskTwo extends CalculatorApplication {

    @Override
    public void question() {

        String fullExpression;
        System.out.print("\n***************** Task 2 **********************\n");

        System.out.print("\nPlease enter a full expression\n");

        fullExpression = checkExpressionInput();

       // Display the Result
       System.out.print("\nResult: " + fullExpression + " = " + cal.singleExpression(fullExpression) + "\n");
    }

}
