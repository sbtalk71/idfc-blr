package com.demo.spring;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Base64;

public class Encrypter {
    public static void main(String[] args) {
       String encoded =Base64.getEncoder().encode("welcome1".getBytes()).toString();

        System.out.println(encoded);

        //String clearText=Base64.getDecoder().decode(encoded);



            }
}
