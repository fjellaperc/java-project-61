package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void Cli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? " );
        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.next();
        //scanner.close();
        System.out.println("Hello, " + nameUser);
    }
}
