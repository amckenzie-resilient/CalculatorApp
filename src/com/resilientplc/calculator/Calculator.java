package com.resilientplc.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double v1, v2, result;

        System.out.print("Please enter your First number: ");
        v1 = input.nextDouble();

        System.out.print("Please enter your Second number: ");
        v2 = input.nextDouble();

        result = v1 + v2;

        System.out.print(result);
    }
}
