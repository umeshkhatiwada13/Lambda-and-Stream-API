package com.lambda.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author umeshkhatiwada13@infodev
 * @project Lambda-and-Stream-API
 * @created 03/05/2022 - 12:24 PM
 */
public class FlatmapExample {
    public static void main(String[] args) {
        // Creating a list of Prime Numbers
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

        System.out.println("The Structure before flattening is : " + listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " + listofInts);
    }
}
