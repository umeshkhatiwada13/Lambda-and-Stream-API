package com.lambda.demo.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream.range(1, 5);    //1,2,3,4
        IntStream.rangeClosed(1, 5);    //1,2,3,4,5
        IntStream.iterate(0, i -> i + 2).limit(10); //0,2,4,6,8,10,12,14,16,18

        IntStream stream = IntStream
                .generate(() -> { return (int)(Math.random() * 10000); });

        stream.limit(10).forEach(System.out::println);

        IntStream.rangeClosed(0, 4)
                .forEach( System.out::println );

        //Converting IntStream to Array
        int[] streamArray = IntStream.of(1, 2, 3, 4, 5).toArray();

        //Converting IntStream to List
        List<Integer> streamList = IntStream.of(1,2,3,4,5)
                .boxed()
                .collect(Collectors.toList());
    }
}
