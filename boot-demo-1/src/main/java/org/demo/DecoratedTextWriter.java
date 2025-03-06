package org.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DecoratedTextWriter implements Writer{
    @Override
    public void write(String message) {
        System.out.println("Decorated Text Writer: "+message);
    }
}
