package hexlet.code;

import hexlet.code.games.Welcome;

import java.util.Scanner;

public class Comparison {
    public static final int ALL_ITERATION = 3;
    public static void comparisonEven(String rules, String[][] gamesData) {
        String nameUser = Welcome.welcome();
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
        String nameUser = Welcome.welcome();
        System.out.println(rules);
        int currentIteration = 0;
        for (String[] gamesDatum : gamesData) {
            System.out.println("Question: " + gamesDatum[0] + " " + gamesDatum[1] + " " + gamesDatum[2]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[3])) {
                System.out.println("Correct!");
                currentIteration++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gamesDatum[3] + "'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currentIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
    public static void comparisonGcd(String rules, String[][] gamesData) {
        String nameUser = Welcome.welcome();
        System.out.println(rules);
        int currenIteration = 0;
        for (String[] gamesDatum: gamesData) {
            System.out.println("Question: " + gamesDatum[0] + " " + gamesDatum[1]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(gamesDatum[2])) {
                System.out.println("Correct!");
                currenIteration++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gamesDatum[2] + "'");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (currenIteration == ALL_ITERATION) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }

    public static void comparisonProgression(String rules, String[][] gamesData) {
        String nameUser = Welcome.welcome();
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
    public static void comparisonPrime(String rules, String[][] gamesData) {
        String nameUser = Welcome.welcome();
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
        }
    }
}

