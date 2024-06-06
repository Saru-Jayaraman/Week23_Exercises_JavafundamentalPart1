package se.lexicon.lexiconExercises;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class SecondsToTimeFormat {
    public static void main(String[] args) {
        Scanner getSecondsValue = new Scanner(System.in);
        System.out.println("Enter seconds to print in the format(HH:MM:SS):");
        long secondsValue = getSecondsValue.nextLong();

        Date dateObject = new Date(secondsValue);
        LocalDateTime localDateTime = dateObject.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = localDateTime.format(dateTimeFormatter);
        System.out.println("Formatted time: "+formattedDate);
    }
}
