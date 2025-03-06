package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WriterApp {

    @Autowired
    @Qualifier("dtw")
    private Writer writer;

    public void printText(String message){
        writer.write(message);
    }
}
