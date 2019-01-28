package com.resilientplc.calculator.Menu;

import Interfaces.Menu;

public class CalculatorMenu implements Menu {

    public void createMenu() {

        System.out.print(" \n *********************************************\n " +
                " -----  Andrae's Awesome Calculator App  -----\n " +
                " *********************************************");

        System.out.print("\nPlease select which task to view: \n");
        System.out.print("1 - Task One \n");
        System.out.print("2 - Task Two \n");
        System.out.print("3 - Task Three \n");
        System.out.print("4 - Exit the application \n");
    }

    public void help() {

        System.out.print("\nWelcome to Andrae's Awesome Calculator! \nThis Calculator allows the following: \n " +
                "* Simple addition and subtraction - Enter 2 values with a + or - operator in-between \n " +
                "* Simple multiplication and division - Enter 2 values with a * or / operator in-between \n " +
                "* A mathematical expression within a single operation and 2 numbers \n ");
    }

    public void exit() {

        System.exit(0);
    }

    public void reset() {

    }

}
