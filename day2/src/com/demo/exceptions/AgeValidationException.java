package com.demo.exceptions;

public class AgeValidationException extends RuntimeException{
    public AgeValidationException() {
    }

    public AgeValidationException(String message) {
        super(message);
    }
}
