package com.demo.spring.exceptions;

public class EmpNotFoundException extends ResourceException{
    public EmpNotFoundException() {
    }

    public EmpNotFoundException(String message) {
        super(message);
    }
}
