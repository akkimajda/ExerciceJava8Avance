package com.akki;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void demonstrateStreamIntermediateOperations() {
        List<String> names = Arrays.asList("Youssef", "Fatima", "Ahmed", "Youssef");

        // filter, map, sorted, distinct
        List<String> sortedDistinctNames = names.stream()
                .filter(name -> name.startsWith("Y"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        sortedDistinctNames.forEach(System.out::println);
    }
}
