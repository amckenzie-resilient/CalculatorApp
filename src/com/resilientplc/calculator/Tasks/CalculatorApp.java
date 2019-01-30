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

}