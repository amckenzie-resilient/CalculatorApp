package com.resilientplc.calculator.Menu;

import Interfaces.Menu;

public class CalculatorMenu implements Menu {

    public void createMenu() {

        System.out.print(
                " \n *********************************************\n " +
                " -----  Andrae's Awesome Calculator App  -----\n " +
                " *********************************************");
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
