package com.resilientplc.calculator;

import Interfaces.Menu;
import com.resilientplc.calculator.Calculations.Calculator;
import com.resilientplc.calculator.Menu.CalculatorMenu;
import com.resilientplc.calculator.Tasks.TaskOne;
import com.resilientplc.calculator.Tasks.TaskThree;
import com.resilientplc.calculator.Tasks.TaskTwo;

import java.util.Scanner;

public abstract class CalculatorApplication {

    public static Scanner input = new Scanner(System.in);
    public static Menu menu = new CalculatorMenu();
    public static Calculator cal = new Calculator();

    public static void main(String[] args) {

        int state;
        boolean running = true;

        CalculatorApplication taskone = new TaskOne();
        CalculatorApplication tasktwo = new TaskTwo();
        CalculatorApplication taskthree = new TaskThree();

        while (running) {

            menu.createMenu();
            state = input.nextInt();

            if (state == 1) {
                taskone.question();
            } else if (state == 2) {
                input.nextLine();
                tasktwo.question();
            } else if (state == 3) {
                input.nextLine();
                taskthree.question();
            } else if (state == 4) {
                running = false;
            }
        }
    }

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
                invalid = false;

            } catch (NumberFormatException e) {
                System.out.print("Incorrect Value Entered!");
                invalid = true;
                input.nextLine();
            }
        }

        return value;
    }

    public abstract void question();

}


