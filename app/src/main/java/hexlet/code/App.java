package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Calculate;
import hexlet.code.games.Welcome;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case "1":
                Welcome.sayHello();
                break;
            case "2":
                Even.runEvenGame();
                break;
            case "3":
                Calculate.runGameCalculation();
                break;
            case "4":
                GCD.runGameGcd();
                break;
            case "5":
                Progression.runProgressionGame();
                break;
            case "6":
                Prime.runPrimeGame();
                break;
            default:
                System.out.println("Please, enter correct option!!!");
                break;
        }
    }
}
