package com.pivottech;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clock {
    LocalDateTime  now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();

}
