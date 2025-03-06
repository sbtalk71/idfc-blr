package org.demo;

import org.springframework.stereotype.Component;

@Component
public class PlainTextWriter implements Writer{
    @Override
    public void write(String message) {
        System.out.println("Plain Text Writer: "+message);
    }
}
