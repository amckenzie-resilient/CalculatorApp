package com.resilientplc.calculator.Tasks;


import Interfaces.Menu;
import com.resilientplc.calculator.Calculations.Calculator;
import com.resilientplc.calculator.Menu.CalculatorMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract public class CalculatorApp {

    public static Scanner input = new Scanner(System.in);
    public static Menu menu = new CalculatorMenu();
    public static Calculator cal = new Calculator();

    public abstract void showQuestion();

    public static boolean help(String value){

        if (value.contentEquals("help")) {
            return true;
        }
        return false;
    }

    public static boolean exit(String value){

        if (value.contentEquals("exit")){
            return true;
        }
        return false;
    }

    public static boolean reset(String value){

        if (value.contentEquals("reset")){
            return true;
        }
        return false;
    }

    public static int checkNumberInput()
    {
        int val = 0;
        boolean invalid = true;

        while (invalid){

            try{
                val = input.nextInt();
                invalid = false;

            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid number!\n");
                invalid = true;
                input.next();
            }
        }
        return val;
    }

    public static String checkExpressionInput() {

        String value = "";
        boolean invalid = true;

        while (invalid) {
            try {
                value =  input.nextLine();

                if(help(value)){
                    menu.help();
                    invalid = true;

                }else {

                invalid = false;}

            } catch (NumberFormatException e) {
                System.out.print("Incorrect Value Entered!");
                invalid = true;
                input.nextLine();
            }
        }

        return value;
    }

    public static String checkStringInput() {
        String value = "";
        boolean invalid = true;

        while (invalid) {

            try {

                value = input.next();

                if (help(value)) {
                    menu.help();
                    System.out.print("Please enter a valid operation:");
                    invalid = true;
                } else if (exit(value)){
                    menu.exit();
                } else if (value.contentEquals("+") || value.contentEquals("-") || value.contentEquals("*") || value.contentEquals("/")) {
                    invalid = false;
                } else {
                    invalid = true;
                    System.out.print("Please enter a valid operator:");
                }

            } catch (NumberFormatException e) {
                System.out.print("Incorrect Value Entered!");
                invalid = true;
                input.nextLine();
            }
        }

        return value;
    }


}