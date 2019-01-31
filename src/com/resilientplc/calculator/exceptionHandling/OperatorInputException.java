package com.resilientplc.calculator.exceptionHandling;

public class OperatorInputException extends Exception
{
    public OperatorInputException(String message){
        super(message);
    }
}
