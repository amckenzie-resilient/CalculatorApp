package com.resilientplc.calculator;

import Interfaces.Menu;
import com.resilientplc.calculator.Menu.CalculatorMenu;
import com.resilientplc.calculator.Tasks.CalculatorApp;
import com.resilientplc.calculator.Tasks.TaskOne;
import com.resilientplc.calculator.Tasks.TaskThree;
import com.resilientplc.calculator.Tasks.TaskTwo;

public class CalculatorApplication {

    public static void main(String[] args) {

        boolean running = true;


        CalculatorApp taskOne = new TaskOne();
        CalculatorApp taskTwo = new TaskTwo();
        CalculatorApp taskThree = new TaskThree();
        Menu menu = new CalculatorMenu();

        while (running) {

            showMenu(menu);

            show(taskOne);
            //show(taskTwo);
            show(taskThree);
        }
    }

    public static void show(CalculatorApp obj)
    {
        obj.showQuestion();
    }
    public static void showMenu(Menu obj){obj.createMenu();}


}




