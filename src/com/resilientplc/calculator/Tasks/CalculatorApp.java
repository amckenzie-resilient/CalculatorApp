package com.resilientplc.calculator.Tasks;


import Interfaces.Menu;
import com.resilientplc.calculator.Calculations.Calculator;
import com.resilientplc.calculator.ExceptionHandling.OperatorInputException;
import com.resilientplc.calculator.Menu.CalculatorMenu;

import java.util.Scanner;

abstract public class CalculatorApp {

    public static Scanner input = new Scanner(System.in);
    public static Menu menu = new CalculatorMenu();
    public static Calculator cal = new Calculator();
    public static String operator;
    public static int result = 0;

    public abstract void showQuestion();
    public abstract void setOperator() throws OperatorInputException;

    public String getOperator()
    {
        return operator;
    }

    public int getResult()
    {
        return result;
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


}