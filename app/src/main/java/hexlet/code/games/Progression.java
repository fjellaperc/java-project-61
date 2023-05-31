package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        String nameUser = Welcome.welcome();
        System.out.println("What number is missing in the progression?");
        int j; //Счетчик для количества итераций в игре
        final int topRangeLimit = 5;  //Для задания мдлины массива
        final int lowRangeLimit = 5; //Для задания длины массива
        final int topRangeBegin = 6; //Для задания начального значения
        final int topRangeStep = 4; //Для задания шага прогрессии
        final int countStep = 3; //Количество раундов в игре
        for (j = 0; j < countStep; j++) {
            int count = (int) (Math.random() * topRangeLimit + lowRangeLimit); //Длина массива
            int emptyElement = (int) (Math.random() * (count - 1) + 1); //Позиция скрытого элемента
            String[] numbers = new String[count];
            String[] compareNumbers = new String[count];
            int currentElement = (int) (Math.random() * topRangeBegin + 1); //Первый элемент прогрессии (от 1 до 7)
            int step = (int) (Math.random() * 4 + 1); //Шаг прогрессии (от 1 до 4)
            numbers[0] = Integer.toString(currentElement);
            compareNumbers[0] = Integer.toString(currentElement);
            for (int i = 1; i < numbers.length; i++) {  //Формируем массив
                currentElement = currentElement + step;
                if (i == emptyElement) {
                    numbers[i] = "..";
                } else {
                    numbers[i] = Integer.toString(currentElement);
                }
                compareNumbers[i] = Integer.toString(currentElement);
            }
            String s = Arrays.toString(numbers).replace(",", ""); //Удаляем запятые
            StringBuilder out = new StringBuilder(s); //массив в стрингбилдер
            out = out.deleteCharAt(0).deleteCharAt(out.length() - 1); // удаляем скобки []
            System.out.println("Question: " + out);  //Выводит вопрос
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (userAnswer.equals(compareNumbers[emptyElement])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + compareNumbers[emptyElement] + "'.");
                System.out.println("Let's try again, " + nameUser + "!");
                break;
            }
        }
        if (j == countStep) {
            System.out.println("Congratulations, " + nameUser + "!");
        }
    }
}

