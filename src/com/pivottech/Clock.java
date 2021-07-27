package com.pivottech;

//Imports for time, formatting, and sleep timer
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            LocalTime time = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println(time.format(formatter));
            //1 sec = 1000mm
            TimeUnit.MILLISECONDS.sleep(1000);
        }
    }
}
