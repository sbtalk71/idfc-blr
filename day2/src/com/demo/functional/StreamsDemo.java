package com.demo.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(1,2,3,4,5,6,7,8,9,12,14,13,16,15,19,18);

        numList.stream().filter(x->x%2==0).forEach(System.out::println);

    //add 10 to each even number and collect them in another list
     List<Integer> evensNewList=  numList.stream().filter(x->x%2==0).map(x->x+10).toList();

     //add all odd numbers

       int sum= numList.stream().filter(x->x%2!=0).mapToInt(x->x.intValue()).sum();
        System.out.println("The Sum = "+sum);

        List<List<Integer>> numList2=Arrays.asList(Arrays.asList(1,2),Arrays.asList(4,5),Arrays.asList(8,10));
        System.out.println(numList2);
        numList2.stream().flatMapToInt(x->x.stream().mapToInt(n->n.intValue())).forEach(System.out::println);
    }
}
