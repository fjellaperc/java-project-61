package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.Random;

public class Progression {
    public static final int TOP_RANGE_STEP = 5; //Для задания шага прогрессии
    public static final int RANGE_FIRST_NUM = 21; //Верхняя граница для первого числа
    public static final int COUNT_STEP = 3; //Количество раундов в игре
    public static final int TOP_RANGE_SIZE = 10; //Маскимальная длина массива
    public static final int LOW_RANGE_SIZE = 6; //Минимальная длина массива
    public static String[] createProgression() {
        int lengthArray = Random.generateNum(LOW_RANGE_SIZE, TOP_RANGE_SIZE);
        int currentElement = Random.generateNum(1, RANGE_FIRST_NUM);
        int step = Random.generateNum(1, TOP_RANGE_STEP);
        String[] outNumbers = new String[lengthArray];
        outNumbers[0] = Integer.toString(currentElement);
        for (int i = 1; i < lengthArray; i++) {
             currentElement = currentElement + step;
             outNumbers[i] = Integer.toString(currentElement);
        }
        return outNumbers;
    }
    public static void runProgressionGame() {
        String rules = "What number is missing in the progression?";
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            String[] numbers = createProgression();
            int emptyElement = Random.generateNum(1, numbers.length); //Позиция пустого элемента
            resultArray[i][1] = numbers[emptyElement]; //Записали правильный ответ
            numbers[emptyElement] = "..";
            String question = String.join(" ", numbers);
            resultArray[i][0] = question;
        }
        Engine.run(rules, resultArray);
    }
}

