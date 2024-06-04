package se.lexicon.lexiconExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void performOperations(double operand1, double operand2, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if(operand2 == 0)
                    throw new ArithmeticException("USER HANDLED MESSAGE: Division by 0 is not allowed...");
                result = operand1 / operand2;
                System.out.println("Result: " + result);
                break;
            case "%":
                result = operand1 % operand2;
                System.out.println("Result: " + result);
                break;
            default:
                throw new IllegalArgumentException("USER HANDLED MESSAGE: Not a valid operator...");
        }
    }
    public static void main(String[] args) {
        String decision = "";
        do {
            try {
                Scanner getOperands = new Scanner(System.in);
                System.out.println("Enter operand1: ");
                double operand1 = getOperands.nextDouble();

                System.out.println("Enter operand2: ");
                double operand2 = getOperands.nextDouble();

                System.out.println("Enter operator: ");
                String operator = getOperands.next();

                performOperations(operand1, operand2, operator);
                System.out.println("Do you want to continue(Y/N)???");
                decision = getOperands.next();
            } catch (InputMismatchException e) {
                System.out.println("============================================");
                System.out.println("USER HANDLED MESSAGE: Not a valid operand...");
                System.out.println("============================================");
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("=============================================");
                System.out.println(e.getMessage());
                System.out.println("=============================================");
            }
        } while(decision.equalsIgnoreCase("y"));
    }
}
