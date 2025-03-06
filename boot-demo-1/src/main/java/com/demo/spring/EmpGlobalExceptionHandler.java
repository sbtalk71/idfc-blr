package com.demo.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmpGlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleException(RuntimeException e){
        return ResponseEntity.ok(e.getStackTrace());
    }

}
