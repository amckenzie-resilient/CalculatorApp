package com.resilientplc.calculator.Tasks;

import Interfaces.Menu;
import com.resilientplc.calculator.CalculatorApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

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
