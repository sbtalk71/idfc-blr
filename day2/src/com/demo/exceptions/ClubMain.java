package com.demo.exceptions;

import java.sql.SQLOutput;

public class ClubMain {
    public static void main(String[] args) {
        Club club= new Club();
        try {
            club.checkAge(17);
        }catch (RuntimeException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(" Club is now closed...");
    }
}
