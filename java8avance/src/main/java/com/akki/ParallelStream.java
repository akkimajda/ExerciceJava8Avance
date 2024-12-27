package com.akki;
import java.util.Arrays;
import java.util.List;

public class ParallelStream {

    public static void demonstrateParallelStreams() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Flux séquentiel
        System.out.println("Sequential Stream:");
        numbers.stream()
                .map(num -> {
                    System.out.println(Thread.currentThread().getName() + " - Processing: " + num);
                    return num * 2;
                })
                .forEach(System.out::println);

        // Flux parallèle
        System.out.println("Parallel Stream:");
        numbers.parallelStream()
                .map(num -> {
                    System.out.println(Thread.currentThread().getName() + " - Processing: " + num);
                    return num * 2;
                })
                .forEach(System.out::println);
    }
}
