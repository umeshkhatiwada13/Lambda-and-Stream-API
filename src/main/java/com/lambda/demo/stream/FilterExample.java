package com.lambda.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20, 25);

        // Using Stream filter(Predicate predicate) to get a stream consisting of the
        // elements that are divisible by 5
        list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);

        // Creating a Stream of Strings
        List<String> stringArray = Arrays.asList("Test", "data", "loading",
                "Doctor", "Strange", "Multiverse", "Madness");
        Stream<String> stringStream = stringArray.stream();

        // Using Stream filter to get a stream consisting of the elements having UpperCase Character
        // at index 1
        stringStream.filter(str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);

        // Using Stream filter(Predicate predicate) to get a stream consisting of the
        // elements ending with s
        stringStream.filter(str -> str.endsWith("s")).forEach(System.out::println);
    }
}
