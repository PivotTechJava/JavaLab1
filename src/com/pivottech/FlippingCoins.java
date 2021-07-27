package com.pivottech;

public class FlippingCoins extends Pluralize {

public static void main(String[] args) {
    flipNHeads(2);
}

 public static void flipNHeads(int n) {
     int nCounter = 0;
     int flipsCount = 0;
     int flipValue;

     while (nCounter < n) {
         flipValue = getFlip();

         if (flipValue == 1) {
             nCounter++;
         } else {
             nCounter = 0;
         }
         flipsCount++;

     }

     System.out.println("It took " + flipsCount + " flips to get "+ n +" " + Pluralize.pluralize("head", n) +
             " in a row.");
 }
    public static int  getFlip() {
        double result = Math.random() >.5 ? 1 : 0;

        System.out.println(result==0.0 ? "Tail" : "Head");
        return (int) result;
    }
}
