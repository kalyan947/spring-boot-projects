package java8practice;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonStreams {
    public static void main(String[] args) {
        List<Person> people=Person.createRoster();

        // Accumulate names into a List
        List<String> list =people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(list);
        // Accumulate names into a TreeSet
        Set<String> set=people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
        String joined=people.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(joined);


    }
}
