package com.pluralsight;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class FormatDates {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern ();







    }
}
