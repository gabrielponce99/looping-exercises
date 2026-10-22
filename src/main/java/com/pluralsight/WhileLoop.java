package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        String text = "I love and hate Java.";
        int count = 0;

        while (count < 5) {
            count = count + 1;
            System.out.println(count + " " + text);
        }
    }
}
