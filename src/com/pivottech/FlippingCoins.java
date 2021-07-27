package com.pivottech;

public class FlippingCoins {
    public static void main(String[] args) {

        //declare an in n
        int n;
        n= 2;
        Pluralize pluralObject_ = new Pluralize();
        //print: it took flipCount times to get n pluralize(head) in a row
       // System.out.println("It took  flips to get "+ n +" " + pluralObject_.pluralize("head", n));


        // declare a countOfN
        int countOfN;
        countOfN = 0;
        // declare flipsCount
        int flipsCount;
        flipsCount=0;

        //flipValue
        int flipValue;

        //while countOfN<n keep flipping
        while (countOfN<n) {
            //getflip
            flipValue = getFlip(); //returns 0 or 1 --1=Heads

            //if getflip=1 then countOfN++
           //debug: System.out.println(flipValue);
            if (flipValue==1) {
                countOfN++;
            }
            flipsCount++;

        }//while
        //get a Pluralize class
        Pluralize pluralObject = new Pluralize();
        //print: it took flipCount times to get n pluralize(head) in a row
        System.out.println("It took " + flipsCount + " flips to get "+ n +" " + pluralObject.pluralize("head", n));
        //declare a function that returns 0 or 1 randomly

    }
    public static int  getFlip() {
        double result;
            result = Math.random() >.5? 1:0;

            System.out.println(result==0.0?"Tail":"Head");
        return (int) result;
    }


}
