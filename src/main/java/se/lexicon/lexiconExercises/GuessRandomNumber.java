package se.lexicon.lexiconExercises;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(500);

//        System.out.println(randomNumber);
        int userNumber;
        int guess = 0;
        do {
            System.out.println("Guess a number between 1 and 500:");
            Scanner scanner = new Scanner(System.in);
            userNumber = scanner.nextInt();
            guess++;
            if(userNumber < randomNumber) {
                System.out.println("Your Guess was too small");
            } else {
                System.out.println("Your Guess was too big");
            }
        } while (userNumber != randomNumber);
        System.out.println("Your guess is correct...");
        System.out.println("Number of guesses you made: " + guess);
    }
}
