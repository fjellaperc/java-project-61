package hexlet.code.games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GCD {
    public static void gcd() {
        String nameUser = Welcome.welcome();
        System.out.println("Find the greatest common divisor of given numbers.");
        int firstNOD;
        int i;
        for (i = 0; i < 3; i++) {
            int num1 = (int) (Math.random() * 20 + 2);
            int num2 = (int) (Math.random() * 20 + 2);
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
        if (i == 3) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
