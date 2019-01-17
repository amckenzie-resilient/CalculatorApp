package com.resilientplc.calculator;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int v1, v2, result;

        System.out.print("Please enter your First number: ");
        v1 = input.nextInt();

        System.out.print("Please enter your Second number: ");
        v2 = input.nextInt();

        result = v1 + v2;

        System.out.print(result);

    }

}
