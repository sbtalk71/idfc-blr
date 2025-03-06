package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> fruiteMap=new HashMap<>();
        fruiteMap.put(1,"apple");
        fruiteMap.put(2,"guava");
        fruiteMap.put(3,"mango");
        fruiteMap.put(4,"orange");
        fruiteMap.put(5,"pear");

        System.out.println(fruiteMap);
        System.out.println(fruiteMap.get(4));


        fruiteMap.remove(3);
        System.out.println(fruiteMap);

        Set<Integer> keys=fruiteMap.keySet();

        for(Integer key:keys){
            System.out.println(key+" -----> "+fruiteMap.get(key));
        }


    }
}

