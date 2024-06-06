package se.lexicon.lexiconExercises;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Average of 3 numbers:");
        System.out.println("Enter 3 numbers...");
        double number1 = scanner.nextLong();
        double number2 = scanner.nextLong();
        double number3 = scanner.nextLong();
        double result = (number1+number2+number3)/3;
        System.out.println("Result: "+result);
    }
}
