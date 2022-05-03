package com.lambda.demo.lambdaexpression;

public class DrawableWithoutLambda {
    public static void main(String[] args) {
        int width = 5;
        Drawable drawable = new Drawable() {
            public void draw() {
                System.out.println("Width is " + width);
            }
        };
        drawable.draw();
    }
}
