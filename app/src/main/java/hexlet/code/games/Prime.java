package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        String nameUser = Welcome.welcome();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int j;
        final int topRangeLimit = 98;
        final int lowRangeLimit = 2;
        final int countStep = 3;
        final int maxLengthArray = 10;
        String answer = "yes";
        for (j = 0; j < countStep; j++) {
            int num = (int) (Math.random() * topRangeLimit + lowRangeLimit);
            for (int i = 2; i < maxLengthArray; i++) {  //Проверка простоты путем деления на числа от 2 до 10
                if (num % i == 0) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }
            System.out.println("Question: " + num);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            if (answer.equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer!!!");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (j == countStep) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
