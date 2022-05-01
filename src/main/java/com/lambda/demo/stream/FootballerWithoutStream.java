package com.lambda.demo.stream;

import java.util.ArrayList;

public class FootballerWithoutStream {
    public static void main(String[] args) {
        ArrayList<Footballer> footballers = new ArrayList<>();
        footballers.add(new Footballer(1, "Karim Benzema", "France", "Real Madrid", 34, 35f));
        footballers.add(new Footballer(2, "C. Ronaldo", "Portugal", "Man Utd.", 37, 50f));
        footballers.add(new Footballer(3, "S. Ramos", "Spain", "PSG", 36, 25f));
        footballers.add(new Footballer(4, "Eden Hazard", "Belgium", "Real Madrid", 31, 30f));
        footballers.add(new Footballer(5, "Leo Messi", "Argentina", "PSG", 35, 40f));

        //Adding 5 years to each footballer's age
        for (int i = 0; i < footballers.size(); i++) {
            footballers.get(i).setAge(footballers.get(i).getAge() + 5);
        }

        System.out.println("\nPrinting all footballers with age after 5 years");
        for (int i = 0; i < footballers.size(); i++) {
            System.out.println(footballers.get(i).getName() + " : " + footballers.get(i).getAge());
        }

    }
}
