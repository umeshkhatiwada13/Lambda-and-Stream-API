package com.lambda.demo;

public class DrawableWithLambda {
    public static void main(String[] args) {
        int length = 10;
        Drawable drawable = () -> System.out.println("Drawing..." + length);
        drawable.draw();
    }
}
