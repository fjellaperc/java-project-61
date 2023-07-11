package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.Random;

public class Progression {
    public static final int TOP_RANGE_STEP = 5; //Для задания шага прогрессии
    public static final int RANGE_FIRST_NUM = 21; //Верхняя граница для первого числа
    public static final int COUNT_STEP = 3; //Количество раундов в игре
    public static final int TOP_RANGE_SIZE = 10; //Маскимальная длина массива
    public static final int LOW_RANGE_SIZE = 6; //Минимальная длина массива
    public static String[] textureProgression() {
        int lengthArray = Random.generateNum(LOW_RANGE_SIZE, TOP_RANGE_SIZE); //Длина массива
        int emptyElement = Random.generateNum(1, lengthArray); //Позиция скрытого элемента(от 1 до 7)
        String[] numbers = new String[lengthArray];
        String[] compareNumbers = new String[lengthArray];
        String[] outArray = new String[2];
        int currentElement = Random.generateNum(1, RANGE_FIRST_NUM); //Задаем значение 1ого элемента
        int step = Random.generateNum(1, TOP_RANGE_STEP); //Шаг прогрессии (от 1 до 4)
        numbers[0] = Integer.toString(currentElement);
        compareNumbers[0] = Integer.toString(currentElement);
        for (int i = 1; i < numbers.length; i++) {  //Формируем массив прогрессии
            currentElement = currentElement + step;
            if (i == emptyElement) {
                numbers[i] = "..";
            } else {
                numbers[i] = Integer.toString(currentElement);
            }
            compareNumbers[i] = Integer.toString(currentElement);
        }
        String question = String.join(" ", numbers);
        outArray[0] = question;
        outArray[1] = compareNumbers[emptyElement];
        return outArray;
    }
    public static void runProgressionGame() {
        String rules = "What number is missing in the progression?";
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int j = 0; j < COUNT_STEP; j++) {
            resultArray[j] = textureProgression();
        }
        Engine.run(rules, resultArray);
    }
}

