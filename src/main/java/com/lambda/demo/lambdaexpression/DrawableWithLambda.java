package com.lambda.demo.lambdaexpression;

public class DrawableWithLambda {
    public static void main(String[] args) {
        int width = 5;
        Drawable drawable = () -> {
            System.out.println("Drawing..." + width);
        };
        drawable.draw();
    }
}
