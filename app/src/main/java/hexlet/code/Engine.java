package hexlet.code;

import hexlet.code.games.Welcome;

import java.util.Scanner;

public class Engine {
    public static void run(String rules, String[][] gamesData) {
        String nameUser = Welcome.sayHello();
        Scanner scanner = new Scanner(System.in);
        System.out.println(rules);
        for (String[] gamesDatum : gamesData) {
            System.out.println("Question: " + gamesDatum[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equalsIgnoreCase(gamesDatum[1])) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gamesDatum[1] + "'");
                System.out.println("Let's try again, " + nameUser + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + nameUser + "!");
        scanner.close();
    }
}

