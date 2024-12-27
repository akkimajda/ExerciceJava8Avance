package com.akki;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTst {

    public static Optional<Person> findPersonByName(String name) {
        List<Person> persons = Arrays.asList(
                new Person("Youssef", "Ait", "123 Rue A"),
                new Person("Fatima", "Bouk", "456 Rue B"),
                new Person("Ahmed", "Ched", "123 Rue A")
        );

        return persons.stream()
                .filter(person -> person.getFirstName().equals(name))
                .findFirst();
    }

    public static void demonstrateOptional() {
        Optional<Person> person = findPersonByName("Youssef");

        person.ifPresentOrElse(
                p -> System.out.println("Person found: " + p),
                () -> System.out.println("Person not found")
        );
    }
}
