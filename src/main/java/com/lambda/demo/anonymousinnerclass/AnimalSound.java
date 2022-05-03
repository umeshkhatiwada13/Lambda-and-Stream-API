package com.lambda.demo.anonymousinnerclass;

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal tiger = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("I am Tiger");
            }
        };
        tiger.makeSound();
    }
}
