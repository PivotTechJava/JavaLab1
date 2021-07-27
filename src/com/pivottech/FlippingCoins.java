package com.pivottech;
import java.util.Random;

public class FlippingCoins {

    public static void main(String[] args) {
        // write your code here
        flipNHeads(3);
    }

    public static int flipNHeads(int n) {
        int headCount = 0;
        while (headCount < n) {
            //int headCount = 0;
            if (Math.random() > .5) {
                System.out.println("Heads");
                ++headCount;
            } else {
                System.out.println("Tails");
            }

        }
        return headCount;

    }
}

