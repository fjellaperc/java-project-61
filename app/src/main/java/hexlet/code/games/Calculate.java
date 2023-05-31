package hexlet.code.games;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    public static String generate() {
        String[] array = {"+", "-", "*", "/"};
        int indexArray = (int) (Math.random() * 3);  //По проверке деление не нужно было поэтому ограничил диапазон от 0 до 2.
        return array[indexArray];
    }
    public static void calc() {
        String nameUser = Welcome.welcome();
        System.out.println("What is the result of the expression?");
        double result = 0;
        int i;
        for (i = 0; i < 3; i++) {
            double num1 = (int) (Math.random() * 20 + 1);
            double num2 = (int) (Math.random() * 20 + 1);
            String firstNum = String.format("%.0f", num1);
            String secondNum = String.format("%.0f", num2);
            String convertStr = " ";
            String resultStr;
            String operation = generate();
            System.out.println("Question: " + firstNum + " " + operation + " " + secondNum);
            if (operation.equals("+")) {
                result = num1 + num2;
                convertStr = String.format("%.0f", result);
            } else if (operation.equals("-")) {
                result = num1 - num2;
                convertStr = String.format("%.0f", result);
            } else if (operation.equals("*")) {
                result = num1 * num2;
                convertStr = String.format("%.0f", result);
            } else if (operation.equals("/")) {
                System.out.println("Please, enter a number with dot '.'");
                System.out.println("Write the number up to the second decimal place");
                System.out.println("Example: 0.03 or 1.27 without rounding");
                result = num1 / num2;
                if (result > (int) result) {  //Чтобы не выводить нули при делении
                    convertStr = String.format("%.2f", result);
                } else {
                    convertStr = String.format("%.0f", result);
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            try {
                double userAnswer = scanner.nextDouble();
                if (userAnswer > (int) userAnswer) {  //Чтобы не выводить нули при делении
                    resultStr = String.format("%.2f", userAnswer);
                } else {
                    resultStr = String.format("%.0f", userAnswer);
                }
                if (Math.abs(result - userAnswer) < 0.01) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + resultStr + "'" + " is wrong answer ;(. ");
                    System.out.println("Correct answer was " + "'" + convertStr + "'");
                    System.out.println("Let's try again, " + nameUser + "!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect type of number, restart Calc");
                return;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}
