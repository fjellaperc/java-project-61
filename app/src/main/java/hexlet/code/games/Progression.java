package hexlet.code.games;

import java.util.Arrays;

public class Progression {
    public static final int TOP_RANGE_LIMIT = 5;  //Для задания мдлины массива
    public static final int LOW_RANGE_LIMIT = 5; //Для задания длины массива
    public static final int TOP_RANGE_BEGIN = 6; //Для задания начального значения
    public static final int TOP_RANGE_STEP = 4; //Для задания шага прогрессии
    public static final int COUNT_STEP = 3; //Количество раундов в игре

    public static String progressionRulesShow() {
        return "What number is missing in the progression?";
    }

    public static String[][] defineProgression() {
        final int strCount = 3;
        String[][] arrays = new String[strCount][2];
        int j; //Счетчик для количества итераций в игре
        for (j = 0; j < COUNT_STEP; j++) {
            int count = (int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT); //Длина массива
            int emptyElement = (int) (Math.random() * (count - 1) + 1); //Позиция скрытого элемента
            String[] numbers = new String[count];
            String[] compareNumbers = new String[count];
            int currentElement = (int) (Math.random() * TOP_RANGE_BEGIN + 1); //Первый элемент прогрессии (от 1 до 7)
            int step = (int) (Math.random() * TOP_RANGE_STEP + 1); //Шаг прогрессии (от 1 до 4)
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
            arrays[j][0] = out.toString();
            arrays[j][1] = compareNumbers[emptyElement];
        }
        return arrays;
    }
}

