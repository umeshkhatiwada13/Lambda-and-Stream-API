package com.lambda.demo.stream;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Footballer {

    private int id;
    private String name;
    private String country;
    private String club;
    private int age;
    private float salary;
}
