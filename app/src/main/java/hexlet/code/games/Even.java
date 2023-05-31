package hexlet.code.games;
import java.util.Scanner;

public class Even {
    public static void evenNum() {
        String nameUser = Welcome.welcome();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i;
        final int topRangeLimit = 100;
        final int lowRangeLimit = 1;
        final int countStep = 3;
        for (i = 0; i < countStep; i++) {
            int questionNum = (int) (Math.random() * topRangeLimit + lowRangeLimit);
            System.out.println("Question: " + questionNum);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (questionNum % 2 == 0 && userAnswer.equals("yes")) { //Четное
                System.out.println("Correct!");
            } else if (questionNum % 2 != 0 && userAnswer.equals("no")) { //Нечетное
                System.out.println("Correct!");
            } else if (questionNum % 2 == 0 && userAnswer.equals("no")) {  //Четное ошибка
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            } else if (questionNum % 2 != 0 && userAnswer.equals("yes")) { //Нечетное ошибка
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            } else {
                System.out.println("Wrong answer!!!");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (i == countStep) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
