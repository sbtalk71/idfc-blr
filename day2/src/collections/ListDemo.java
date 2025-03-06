package collections;

import java.util.*;
import java.util.function.Predicate;

public class ListDemo {
    public static void main(String[] args) {

       // List<String> fruits=new ArrayList<>();
       // List<String> fruits=new LinkedList<>();
        List<String> fruits=new Vector<>();

        fruits.add("mango");
        fruits.add("banana");
        //fruits.add(100);
        fruits.add("apple");
        fruits.add("orange");

        System.out.println(fruits);
        fruits.add("pear");
        fruits.add(2,"guava");

        System.out.println(fruits);

        Iterator<String> itr=fruits.iterator();

        while(itr.hasNext()){
            String fruit=itr.next();
            System.out.println(fruit);
        }

        for(String fruit:fruits){
            System.out.println(fruit);
        }

        Predicate<Integer> p= x ->x%2==0;
}

class MyPredicate implements Predicate<Integer>{

        @Override
        public boolean test(Integer x) {
        return x%2==0;
    }
    };
}