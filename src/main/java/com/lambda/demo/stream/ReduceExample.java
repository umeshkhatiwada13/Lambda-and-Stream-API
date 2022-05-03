package com.lambda.demo.stream;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        // creating a list of Strings
        List<String> words = Arrays.asList("a", "Stream", "lambda",
                "data", "LongestString");

        // The lambda expression passed to  reduce() method takes two Strings
        // and returns the longer String. The result of the reduce() method is
        // an Optional because the list on which reduce() is called may be empty.
        Optional<String> longestString = words.stream().reduce((word1, word2)
                -> word1.length() > word2.length() ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

        // String array
        String[] array = {"Hello", "Lambda", "Stream"};

        Arrays.stream(array).forEach(StringUtils::capitalize);

        // The result of the reduce() method is an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> stringCombine = Arrays.stream(array)
                .reduce((str1, str2) -> str1 + "-" + str2);

        // Displaying the combined String
        stringCombine.ifPresent(System.out::println);

        // Creating list of integers
        List<Integer> intArray = Arrays.asList(-2, 0, 4, 6, 8);

        // Finding sum of all elements
        int sum = intArray.stream().reduce(0,
                (element1, element2) -> element1 + element2);

        // Displaying sum of all elements
        System.out.println("The sum of all elements is " + sum);
    }
}
