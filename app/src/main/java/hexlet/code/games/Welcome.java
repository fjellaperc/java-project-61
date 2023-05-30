package hexlet.code.games;

import java.util.Scanner;

public class Welcome {
    public static String welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.next();
        System.out.println("Hello, " + nameUser + "!");
        return nameUser;
    }
}
