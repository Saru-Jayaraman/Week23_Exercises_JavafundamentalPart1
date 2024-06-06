package se.lexicon.lexiconExercises;

import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arithmetic Operations: Add/Sub/Multiply/Divide");
        System.out.println("Enter two numbers...");
        double number1 = scanner.nextLong();
        double number2 = scanner.nextLong();
        System.out.println("Addition:" + (number1+number2));
        System.out.println("Subtraction:" + (number1-number2));
        System.out.println("Multiplication:" + (number1*number2));
        System.out.println("Division:" + (number1/number2));
    }
}
