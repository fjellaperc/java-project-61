package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        String nameUser = Welcome.welcome();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int j;
        String answer = "yes";
        for (j = 0; j < 3; j++) {
            int num = (int) (Math.random() * 98 + 2);
            for (int i = 2; i < 10; i++) {  //Проверка простоты путем деления на числа от 2 до 10
                if (num % i == 0) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }
            System.out.println(num);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            if (answer.equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer!!!");
                System.out.println("Let's try again, " + nameUser);
                break;
            }
        }
        if (j == 3) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
