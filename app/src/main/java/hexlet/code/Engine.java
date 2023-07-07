package hexlet.code;

import hexlet.code.games.Welcome;

import java.util.Scanner;

public class Engine {
    public static final int ALL_ITERATION = 3;
    public static void run(String rules, String[][] gamesData) {
        String nameUser = Welcome.sayHello();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        //String userChoice = scanner.next();
        int currentIteration = 0; // Счетчик для проверки ВСЕХ правильных ответов пользователя
        System.out.println(rules);
        for (String[] gamesDatum : gamesData) {
            System.out.println("Question: " + gamesDatum[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[1])) {
                System.out.println("Correct!");
                currentIteration++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gamesDatum[1] + "'");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currentIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}

