package com.resilientplc.calculator.ExceptionHandling;

public class StringInputException extends Exception
{
    public StringInputException(String message){
        super(message);
    }
}
