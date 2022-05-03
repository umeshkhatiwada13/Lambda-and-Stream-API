package com.lambda.demo.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author umeshkhatiwada13@infodev
 * @project Lambda-and-Stream-API
 * @created 03/05/2022 - 10:22 AM
 */
public class ForEachExample {
    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> integerList = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");
        // displaying the stream with elements sorted in natural order
        integerList.stream().sorted().forEach(System.out::println);

        // Creating a list of strings
        List<String> stringList = Arrays.asList("Hello", "world",
                "WORLD", "World", "HEllo", "hello");

        System.out.println("The sorted stream is : ");

        // displaying the stream with elements sorted in their natural order
        stringList.stream().sorted().forEach(System.out::println);
    }
}
