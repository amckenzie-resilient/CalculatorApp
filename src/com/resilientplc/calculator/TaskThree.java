package com.resilientplc.calculator;

import java.util.Scanner;

public class TaskThree extends CalculatorApplication {

    private static Calculator cal = new Calculator();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String mathematicalOp;
        int result;

        // Enter a full Expression Task 3
        System.out.print("\n***************** Task 3 **********************\n");

        System.out.print("\nPlease enter a full mathematical operation\n");
        mathematicalOp = input.nextLine();

        result = cal.multipleExpression(mathematicalOp);
    }
}
