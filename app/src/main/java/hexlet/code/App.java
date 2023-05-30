package hexlet.code;
import hexlet.code.games.Calculate;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Welcome;
import hexlet.code.games.GCD;

import java.util.InputMismatchException;
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
        try {
            int userInt = scanner.nextInt();
            System.out.println("Your choice: " + userInt);
            if (userInt == 1) {
                Welcome.welcome();
            } else if (userInt == 2) {
                Even.evenNum();
            } else if (userInt == 3) {
                Calculate.calc();
            } else if (userInt == 4) {
                GCD.gcd();
            } else if (userInt == 5) {
                Progression.progression();
            } else if (userInt == 6) {
                Prime.prime();
            } else {
                System.out.println("Please, enter correct option!!!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, enter correct option!!!");
        }
    }
}
