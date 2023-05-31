package hexlet.code.games;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    public static String generate() {
        String[] array = {"+", "-", "*", "/"};
        int topRangeLimit = 3;
        int indexArray = (int) (Math.random() * topRangeLimit);
        return array[indexArray];
    }
    public static void calc() {
        String nameUser = Welcome.welcome();
        System.out.println("What is the result of the expression?");
        final int topRangeLimit = 20;
        final int lowRangeLimit = 1;
        final int allStep = 3;
        int result = 0;
        int i;
        for (i = 0; i < allStep; i++) {
            int num1 = (int) (Math.random() * topRangeLimit + lowRangeLimit);
            int num2 = (int) (Math.random() * topRangeLimit + lowRangeLimit);
            /*String firstNum = String.format("%.0f", num1);
            String secondNum = String.format("%.0f", num2);
            String convertStr = " ";
            String resultStr;*/
            String operation = generate();
            System.out.println("Question: " + num1 + " " + operation + " " + num2);
            if (operation.equals("+")) {
                result = num1 + num2;
                //convertStr = String.format("%.0f", result);
            } else if (operation.equals("-")) {
                result = num1 - num2;
                //convertStr = String.format("%.0f", result);
            } else if (operation.equals("*")) {
                result = num1 * num2;
                //convertStr = String.format("%.0f", result);
            } /* else if (operation.equals("/")) {
                System.out.println("Please, enter a number with dot '.'");
                System.out.println("Write the number up to the second decimal place");
                System.out.println("Example: 0.03 or 1.27 without rounding");
                result = num1 / num2;
                if (result > (int) result) {  //Чтобы не выводить нули при делении
                    convertStr = String.format("%.2f", result);
                } else {
                    convertStr = String.format("%.0f", result);
                }
            }*/
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            try {
                int userAnswer = scanner.nextInt();
                /* if (userAnswer > (int) userAnswer) {  //Чтобы не выводить нули при делении
                    resultStr = String.format("%.2f", userAnswer);
                } else {
                    resultStr = String.format("%.0f", userAnswer);
                }*/
                if (userAnswer == result) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                    System.out.println("Correct answer was " + "'" + result + "'");
                    System.out.println("Let's try again, " + nameUser + "!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect type of number, restart Calc");
                return;
            }
        }
        if (i == allStep) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
