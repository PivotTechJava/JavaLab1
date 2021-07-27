package com.pivottech;
import java.util.Random;

public class FlippingCoins {
    public static void main(String[] args) {

    }

    public static void flipNHeads(int n) {
        String flip1 = "Head";
        String flip2 = "Tails";

        Random randomNum = new Random();
        int heads = 0;
        int tails = 1;

    public void flip() {
        int result = randomNum.nextInt(2);
        if (result == 0) {
            heads = flip1;
            System.out.println("You flipped Heads!");
        } else {
            coinFlip = flip2;
            System.out.println("You flipped Tails!");
        }
    }
}

