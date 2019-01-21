package com.resilientplc.calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCalculator {

    Calculator testCal = new Calculator();

    @Test
    public void TestAdd(){

        assertEquals ("Add function as returned an error! ", 7,(testCal.add(5, 2) ));
        assertEquals ("Add function as returned an error! ", 10,(testCal.add(0, 10) ));
        assertEquals ("Add function as returned an error! ", 10,(testCal.add(10, 0) ));
        assertEquals ("Add function as returned an error! ", -20,(testCal.add(-10, -10) ));
        assertEquals ("Add function as returned an error! ", 20,(testCal.add(10, 10) ));
    }

    @Test
    public void TestSubtract(){

        assertEquals ("Subtract function as returned an error! ", 0,(testCal.subtract(5, 5) ));
        assertEquals ("Subtract function as returned an error! ", -10,(testCal.subtract(0, 10) ));
        assertEquals ("Subtract function as returned an error! ", 10,(testCal.subtract(10, 0) ));
        assertEquals ("Subtract function as returned an error! ", 0,(testCal.subtract(-10, -10) ));
        assertEquals ("Subtract function as returned an error! ", 0,(testCal.subtract(10, 10) ));
    }

    @Test
    public void TestMultiple(){

        assertEquals ("Multiple function as returned an error!", 25,(testCal.multiple(5, 5) ));
        assertEquals ("Multiple function as returned an error!", 0,(testCal.multiple(0, 10) ));
        assertEquals ("Multiple function as returned an error! ", 0,(testCal.multiple(10, 0) ));
        assertEquals ("Multiple function as returned an error! ", 100,(testCal.multiple(-10, -10) ));
        assertEquals ("Multiple function as returned an error! ", 100,(testCal.multiple(10, 10) ));
    }

    @Test
    public void TestDivide(){

        assertEquals ("Divide function as returned an error! ", 1,(testCal.divide(5, 5) ));
        assertEquals ("Divide function as returned an error!", 0,(testCal.divide(0, 10) ));
        //assertEquals ("Wrong Result returned in , ", 0,(test.divide(10, 0) ));  // need to add a check/error for dividing by zero!
        assertEquals ("Divide function as returned an error! ", 1,(testCal.divide(-10, -10) ));
        assertEquals ("Divide function as returned an error!", 1,(testCal.divide(10, 10) ));
    }
}