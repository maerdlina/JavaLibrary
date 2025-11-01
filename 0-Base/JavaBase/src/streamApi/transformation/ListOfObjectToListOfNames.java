package streamApi.transformation;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfObjectToListOfNames {
    public static void main(String[] args) {
        List<Person> peoples = Arrays.asList(
                new Person("Alex", 18, "New York", "Toyota"),
                new Person("Ogi", 30, "Paris", "Renault"),
                new Person("Gianni", 22, "Parioli", "Porsche Panamera")
        );

        List<String> names = peoples.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
