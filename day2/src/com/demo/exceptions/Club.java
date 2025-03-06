package com.demo.exceptions;

public class Club {

    public boolean checkAge(int age){
        try {
            if (age < 18 || age > 60) {
                throw new AgeValidationException("Age not permitted");
            } else {
                System.out.println("You are allowed to enter the club");
                return true;
            }
        }catch (AgeValidationException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
