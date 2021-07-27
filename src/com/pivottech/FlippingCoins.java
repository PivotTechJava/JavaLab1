package com.pivottech;

public class FlippingCoins {
    public static void main(String[] args) {
        flipNHeads(3);
    }

    public static void flipNHeads(int n) {
        int flips = 0;
        int headFlipsInARow = 0;

        while (headFlipsInARow != n) {
            double randomNum = Math.random();
            if (randomNum >= .5) {
                headFlipsInARow++;
                flips++;
                System.out.println("Flip " + flips + ": heads");
            } else {
                headFlipsInARow = 0;
                flips++;
                System.out.println("Flip " + flips + ": tails");
            }
        }
        System.out.println("It took " + flips + " flips to get " + n + " heads in a row.");
    }
}
