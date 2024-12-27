package com.akki;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTst {

    public static void demonstrateCollectors() {
        List<Person> persons = Arrays.asList(
                new Person("Youssef", "Ait", "123 Rue A"),
                new Person("Fatima", "Bouk", "456 Rue B"),
                new Person("Ahmed", "Ched", "123 Rue A")
        );

        // toList
        List<String> firstNames = persons.stream()
                .map(Person::getFirstName)
                .collect(Collectors.toList());

        // toSet
        Set<String> addresses = persons.stream()
                .map(Person::getAdress)
                .collect(Collectors.toSet());

        // toMap
        Map<String, String> nameToAddress = persons.stream()
                .collect(Collectors.toMap(Person::getFirstName, Person::getAdress));

        // groupingBy
        Map<String, List<Person>> groupedByAddress = persons.stream()
                .collect(Collectors.groupingBy(Person::getAdress));

        // partitioningBy
        Map<Boolean, List<Person>> partitionedByNameStartingWithA = persons.stream()
                .collect(Collectors.partitioningBy(person -> person.getFirstName().startsWith("A")));

        System.out.println(firstNames);
        System.out.println(addresses);
        System.out.println(nameToAddress);
        System.out.println(groupedByAddress);
        System.out.println(partitionedByNameStartingWithA);
    }
}
