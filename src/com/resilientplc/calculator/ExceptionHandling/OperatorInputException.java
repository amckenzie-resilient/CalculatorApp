package com.resilientplc.calculator.ExceptionHandling;

public class OperatorInputException extends Exception
{
    public OperatorInputException(String message){
        super(message);
    }
}
