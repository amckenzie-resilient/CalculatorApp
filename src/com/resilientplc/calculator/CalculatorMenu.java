package com.resilientplc.calculator;

import Interfaces.Menu;

public class CalculatorMenu implements Menu {

    public void CreateMenu(){

        System.out.print(" \n *********************************************\n " +
        " -----  Andrae's Awesome Calculator App  -----\n " +
        " *********************************************");
    }

    public void Help(){

        System.out.print("\nWelcome to Andrae's Awesome Calculator! \nThis Calculator allows the following: \n " +
        "* Simple addition and subtraction - Enter 2 values with a + or - operator in-between \n " +
        "* Simple multiplication and division - Enter 2 values with a * or / operator in-between \n " +
        "* A mathematical expression within a single operation and 2 numbers \n ");
    }

    public void Exit(){

        System.exit(0);
    }

    public void Reset(){

    }

    public Boolean IsActive(){
        return true;
    }

    public Boolean IsInactive(){
        return false;
    }

    public Boolean Activate(){
        return true;
    }

    public Boolean DeActivate(){
        return false;
    }


}
