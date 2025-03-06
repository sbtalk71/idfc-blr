package com.demo.spring.exceptions;

public class EmpExistsException extends ResourceException{
    public EmpExistsException() {
    }

    public EmpExistsException(String message) {
        super(message);
    }
}
