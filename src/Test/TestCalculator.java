package Test;
import com.resilientplc.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCalculator {

    Calculator testCal = new Calculator();

    @Test
    public void TestAdd(){

        assertEquals ("Add function has returned an error! ", 7,(testCal.Add(5, 2) ));
        assertEquals ("Add function has returned an error! ", 10,(testCal.Add(0, 10) ));
        assertEquals ("Add function has returned an error! ", 10,(testCal.Add(10, 0) ));
        assertEquals ("Add function has returned an error! ", -20,(testCal.Add(-10, -10) ));
        assertEquals ("Add function has returned an error! ", 20,(testCal.Add(10, 10) ));
    }

    @Test
    public void TestSubtract(){

        assertEquals ("Subtract function has returned an error! ", 0,(testCal.Subtract(5, 5) ));
        assertEquals ("Subtract function has returned an error! ", -10,(testCal.Subtract(0, 10) ));
        assertEquals ("Subtract function has returned an error! ", 10,(testCal.Subtract(10, 0) ));
        assertEquals ("Subtract function has returned an error! ", 0,(testCal.Subtract(-10, -10) ));
        assertEquals ("Subtract function has returned an error! ", 0,(testCal.Subtract(10, 10) ));
    }

    @Test
    public void TestMultiple(){

        assertEquals ("Multiple function has returned an error!", 25,(testCal.Multiple(5, 5) ));
        assertEquals ("Multiple function has returned an error!", 0,(testCal.Multiple(0, 10) ));
        assertEquals ("Multiple function has returned an error! ", 0,(testCal.Multiple(10, 0) ));
        assertEquals ("Multiple function has returned an error! ", 100,(testCal.Multiple(-10, -10) ));
        assertEquals ("Multiple function has returned an error! ", 100,(testCal.Multiple(10, 10) ));
    }

    @Test
    public void TestDivide(){

        assertEquals ("Divide function has returned an error! ", 1,(testCal.Divide(5, 5) ));
        assertEquals ("Divide function has returned an error!", 0,(testCal.Divide(0, 10) ));
        assertEquals ("Divide function has returned an error! ", 1,(testCal.Divide(-10, -10) ));
        assertEquals ("Divide function has returned an error!", 1,(testCal.Divide(10, 10) ));
     }

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {

        assertEquals ("Wrong Result returned in , ", 0,(testCal.Divide(10, 0) ));

    }

}