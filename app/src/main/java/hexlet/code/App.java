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
        final int greet = 1;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progressGame = 5;
        final int primeGame = 6;
        Scanner scanner = new Scanner(System.in);
        try {
            int userInt = scanner.nextInt();
            System.out.println("Your choice: " + userInt);
            if (userInt == greet) {
                Welcome.sayHello();
            } else if (userInt == evenGame) {
                Comparison.comparisonEven(Even.evenRulesShow(), Even.evenDefine());
            } else if (userInt == calcGame) {
                Comparison.comparisonCalc(Calculate.ruleCalcShow(), Calculate.calculation());
            } else if (userInt == gcdGame) {
                Comparison.comparisonGcd(GCD.gcdRulesShow(), GCD.gcdFound());
            } else if (userInt == progressGame) {
                Comparison.comparisonProgression(Progression.progressionRulesShow(), Progression.defineProgression());
            } else if (userInt == primeGame) {
                Comparison.comparisonPrime(Prime.primeRulesShow(), Prime.primeDefine());
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, enter correct option!!!");
        }
    }
}
