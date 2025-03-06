package collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

       //Set<String> fruits= new HashSet<>();
        Set<String> fruits= new TreeSet<>();

        fruits.add("mango");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        System.out.println(fruits);
        fruits.add("pear");


        System.out.println(fruits);

        Iterator<String> itr=fruits.iterator();

        while(itr.hasNext()){
            String fruit=itr.next();
            System.out.println(fruit);
        }

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
