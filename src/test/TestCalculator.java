package test;
import com.resilientplc.calculator.calculation.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator testCal = new Calculator();

    @Test
    public void testAdd() {

        assertEquals("Adding two numbers together returned an error! ", 7, (testCal.add(5, 2)));
        assertEquals("Adding zero to ten returned an error! ", 10, (testCal.add(0, 10)));
        assertEquals("Adding ten to zero returned an error! ", 10, (testCal.add(10, 0)));
        assertEquals("Adding minus 10 together returned an error! ", -20, (testCal.add(-10, -10)));
        assertEquals("Adding 10 by itself returned an error! ", 20, (testCal.add(10, 10)));
        //assertEquals("Message here", 100, (testCal.add(01,100)));
    }

    @Test
    public void testSubtract() {

        assertEquals("Subtracting two numbers together returned an error! ", 0, (testCal.subtract(5, 5)));
        assertEquals("Subtracting zero from ten returned an error!", -10, (testCal.subtract(0, 10)));
        assertEquals("Subtracting ten from zero returned an error! ", 10, (testCal.subtract(10, 0)));
        assertEquals("Subtracting minus 10 together returned an error! ", 0, (testCal.subtract(-10, -10)));
        assertEquals("Subtracting 10 by itself returned an error!  ", 0, (testCal.subtract(10, 10)));
    }

    @Test
    public void testMultiple() {

        assertEquals("Multiplying two numbers together returned an error!", 25, (testCal.multiple(5, 5)));
        assertEquals("Multiplying zero from ten returned an error!", 0, (testCal.multiple(0, 10)));
        assertEquals("Multiplying ten from zero returned an error!  ", 0, (testCal.multiple(10, 0)));
        assertEquals("Multiplying minus 10 together returned an error! ", 100, (testCal.multiple(-10, -10)));
        assertEquals("Multiplying 10 by itself returned an error! ", 100, (testCal.multiple(10, 10)));
    }

    @Test
    public void testDivide() {

        assertEquals("Dividing two numbers together returned an error! ", 1, (testCal.divide(5, 5)));
        assertEquals("Dividing zero from ten returned an error!", 0, (testCal.divide(0, 10)));
        assertEquals("Dividing minus 10 together returned an error!", 1, (testCal.divide(-10, -10)));
        assertEquals("Dividing 10 by itself returned an error!", 1, (testCal.divide(10, 10)));
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivideByZero() {

        assertEquals("Wrong Result returned in , ", 0, (testCal.divide(10, 0)));

    }

    @Test
    public void testSingleExpression() {

    }

    @Test
    public void testMultipleExpression() {

    }

}