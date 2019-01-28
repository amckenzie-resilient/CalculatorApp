package com.resilientplc.calculator;

import Interfaces.Menu;
import java.util.Scanner;

public abstract class CalculatorApplication {

    public static Scanner input = new Scanner(System.in);
    public static Calculator cal = new Calculator();
    public static Menu menu = new CalculatorMenu();

    public static void main(String[] args) {

        int state;
        boolean running = true;

        TaskOne task1 = new TaskOne();
        TaskTwo task2 = new TaskTwo();
        TaskThree task3 = new TaskThree();

        while (running) {

            menu.createMenu();

            state = input.nextInt();

            if (state == 1) {
                task1.main(args);
            } else if (state == 2) {
                task2.main(args);
            } else if (state == 3) {
                task3.main(args);
            } else if (state == 4) {
                running = false;
            }
        }
    }

}


