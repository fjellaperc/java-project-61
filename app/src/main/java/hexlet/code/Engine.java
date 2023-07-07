package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Welcome;

import java.util.Scanner;

public class Engine {
    public static final int ALL_ITERATION = 3;
    public static void run(String rules, String[][] gamesData) {
        String nameUser = Welcome.sayHello();
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        //String userChoice = scanner.next();
        int currentIteration = 0; // Для проверки ВСЕХ правильных ответов пользователя
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


    /*public static void comparisonEven(String rules, String[][] gamesData, String nameUser) {
        int currentIteration = 0;
        System.out.println(rules);
        for (String[] gamesDatum : gamesData) {
            System.out.println("Question: " + gamesDatum[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
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
    public static void comparisonCalc(String rules, String[][] gamesData) {
        String nameUser = Welcome.sayHello();
        System.out.println(rules);
        int currentIteration = 0;
        final int columnCorrectAnswer = 3;
        for (String[] gamesDatum : gamesData) {
            System.out.println("Question: " + gamesDatum[0] + " " + gamesDatum[1] + " " + gamesDatum[2]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[columnCorrectAnswer])) {
                System.out.println("Correct!");
                currentIteration++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gamesDatum[columnCorrectAnswer] + "'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currentIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
    public static void comparisonGcd(String rules, String[][] gamesData) {
        String nameUser = Welcome.sayHello();
        System.out.println(rules);
        int currentIteration = 0;
        for (String[] gamesDatum: gamesData) {
            System.out.println("Question: " + gamesDatum[0] + " " + gamesDatum[1]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[2])) {
                System.out.println("Correct!");
                currentIteration++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gamesDatum[2] + "'");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currentIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }

    public static void comparisonProgression(String rules, String[][] gamesData) {
        String nameUser = Welcome.sayHello();
        System.out.println(rules);
        int currentIteration = 0;
        for (String[] gamesDatum : gamesData) {
            System.out.println("Question: " + gamesDatum[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[1])) {
                System.out.println("Correct!");
                currentIteration++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + gamesDatum[1] + "'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currentIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
    public static void comparisonPrime(String rules, String[][] gamesData, String nameUser) {
        //String nameUser = Welcome.sayHello();
        int currentIteration = 0;
        System.out.println(rules);
        for (String[] gamesDatum: gamesData) {
            System.out.println("Question: " +  gamesDatum[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[1])) {
                System.out.println("Correct!");
                currentIteration++;
            } else {
                System.out.println("Wrong answer!!!");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currentIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }*/

