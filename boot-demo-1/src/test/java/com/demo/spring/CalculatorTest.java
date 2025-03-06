package com.demo.spring;
import org.demo.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    Calculator cal=new Calculator();

@Test
    public void testAddMethodSuccess(){
       int res=cal.add(1,3);
        Assertions.assertEquals(4,res);
    }
}
