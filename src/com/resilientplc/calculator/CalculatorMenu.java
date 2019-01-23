package com.resilientplc.calculator;

import Interfaces.Menu;

public class CalculatorMenu implements Menu {

    public void CreateMenu(){

        System.out.print(" \n *********************************************\n");
        System.out.print(" -----  Andrae's Awesome Calculator App  -----\n");
        System.out.print(" *********************************************");
    }

    public void Help(){

        System.out.print("\nWelcome to Andrae's Awesome Calculator! \nThis Calculator allows the following: \n");
        System.out.print("* Simple addition and subtraction - Enter 2 values with a + or - operator in-between \n");
        System.out.print("* Simple multiplication and division - Enter 2 values with a * or / operator in-between \n");
        System.out.print("* A mathematical expression within a single operation and 2 numbers \n ");
    }

    public void Exit(){

        System.exit(0);
    }

    public Boolean IsActive(){ return true; }

    public Boolean IsInactive(){ return false; }

}
