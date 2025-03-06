package com.demo.functional;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaMain {
    public static void main(String[] args) {

        Greeting gm=new GoodMorning(); //conventional approach

        Greeting ge=() ->"Good Evening";

        BiFunction<Integer,Integer,Integer> sum=(x,y)->x+y;

        Predicate<Integer> isEven=(x)->x%2==0;

        System.out.println("is 8 even "+isEven.test(8));



    }
}

class GoodMorning implements Greeting{
    @Override
    public String greet() {
        return "Good Morning";
    }
}