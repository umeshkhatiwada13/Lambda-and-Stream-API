package com.lambda.demo.lambdaexpression;

// A Java program to demonstrate simple lambda expressions

import java.util.ArrayList;

class LambdaTest {
    public static void main(String[] args) {
        // Creating an ArrayList with elements
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);

        // Using lambda expression to print all elements
        // of intArray
        System.out.println("All Numbers : ");
        intArray.forEach(System.out::println);

        // Using lambda expression to print even elements
        // of intArray
        System.out.println("Even Numbers : ");
        intArray.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });
    }
}
