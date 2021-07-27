package com.pivottech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String formattedTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(formattedTime);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
