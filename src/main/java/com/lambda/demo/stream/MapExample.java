package com.lambda.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and displaying the corresponding new stream
        list.stream().map(n -> n * n).forEach(System.out::println);

        // Creating a list of Strings
        List<String> stringList = Arrays.asList("Test", "data", "loading",
                "Doctor", "Strange", "Multiverse", "Madness");

        // Using Stream to convert the Strings in stream to UpperCase form
        List<String> answer = stringList.stream().map(String::toUpperCase).
                collect(Collectors.toList());

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);

        // Using Stream map and displaying the length of each String
        stringList.stream().map(String::length).forEach(System.out::println);
    }
}
