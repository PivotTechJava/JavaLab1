package com.pivottech;

public class Pluralize {
    public static void main(String[] args) {
        pluralize("dog", 3);
    }
    public static void pluralize(String word, int number) {
        if (number >= 1 || number == 0) {
            System.out.println("I own " + number + " " + word + "s.");
        }
    }
}
