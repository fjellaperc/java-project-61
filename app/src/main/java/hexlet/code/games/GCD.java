package hexlet.code.games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GCD {
    public static void gcd() {
        String nameUser = Welcome.welcome();
        System.out.println("Find the greatest common divisor of given numbers.");
        int firstNOD;
        int i;
        final int topRangeLimit = 20;
        final int lowRangeLimit = 2;
        final int countStep = 3;
        for (i = 0; i < countStep; i++) {
            int num1 = (int) (Math.random() * topRangeLimit + lowRangeLimit);
            int num2 = (int) (Math.random() * topRangeLimit + lowRangeLimit);
            System.out.println("Question: " + num1 + " " + num2);
            if (num1 >= num2) {
                firstNOD = num2;
            } else {
                firstNOD = num1;
            }
            while (num1 % firstNOD != 0 || num2 % firstNOD != 0) {
                --firstNOD;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            try {
                int userAnswer = scanner.nextInt();
                if (userAnswer == firstNOD) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                    System.out.println("Correct answer was '" + firstNOD + "'");
                    System.out.println("Let's try again, " + nameUser + "!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter correct type number!!!");
                return;
            }
        }
        if (i == countStep) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
