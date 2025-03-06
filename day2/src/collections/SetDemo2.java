package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Person> personSet= new HashSet<>();
        personSet.add(new Person(3,"Amit"));
        personSet.add(new Person(2,"Shanker"));
        personSet.add(new Person(1,"Sheela"));
        personSet.add(new Person(4,"Veera"));
        personSet.add(new Person(3,"Raju"));
        personSet.add(new Person(5,"Kiran"));

        System.out.println(personSet);
    }
}
