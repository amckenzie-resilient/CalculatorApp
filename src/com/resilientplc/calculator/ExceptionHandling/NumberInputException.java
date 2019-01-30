package com.resilientplc.calculator.ExceptionHandling;

public class NumberInputException extends Exception {

    public NumberInputException(String message){
        super(message);
    }
}
