package com.demo.spring;

import com.demo.spring.exceptions.ResourceException;
import com.demo.spring.util.ResponseMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmpGlobalExceptionHandler {

    @ExceptionHandler(ResourceException.class)
    public ResponseEntity handleException(ResourceException e){
        return ResponseEntity.ok(new ResponseMessage(e.getMessage()));
    }





}
