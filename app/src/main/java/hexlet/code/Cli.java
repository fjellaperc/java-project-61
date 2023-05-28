package hexlet.code;
import java.util.Scanner;
public class Cli {
	public static void outUser() {
		Scanner scanner = new Scanner(System.in);
		String nameUser = scanner.next();
		System.out.println("Hello, " + nameUser);
		scanner.close();
	}
}