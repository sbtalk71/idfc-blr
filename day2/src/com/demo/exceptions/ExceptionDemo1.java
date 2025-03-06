package com.demo.exceptions;

import javax.xml.transform.stream.StreamSource;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 10;
            double d = a / b;
            System.out.println("No Exceptions..");
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Finaly block executes...");
        }
        System.out.println("Normal flow resumed...");
    }
}
