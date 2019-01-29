package com.resilientplc.calculator.Tasks;
import com.resilientplc.calculator.CalculatorApplication;

public class TaskThree extends CalculatorApplication {

    @Override
    public void question() {

        String mathematicalOp;
        int result;

        // Enter a full Expression Task 3
        System.out.print("\n***************** Task 3 **********************\n");

        System.out.print("\nPlease enter a full mathematical operation\n");
        mathematicalOp = checkExpressionInput();

        result = cal.multipleExpression(mathematicalOp);

    }

}
