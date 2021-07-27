package com.pivottech;

public class Pluralize {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    }

    public static String pluralize(String item, Integer count) {
        if (count == 0 || count > 1) {
            item = item + "s";
        }

        return item;
    }

}
