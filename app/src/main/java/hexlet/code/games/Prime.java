package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int TOP_RANGE_LIMIT = 12; //Верхняя граница от 2 до 100
    public static final int LOW_RANGE_LIMIT = 2; //Нижняя граница
    public static final int COUNT_STEP = 3; // Количество раундов
    public static final int MAX_LENGTH_ARRAY = 10;

    public static boolean defineNOD(int num) { // Алгоритм Евклида
        int countNod = 0;
        for (int i = 2; i < MAX_LENGTH_ARRAY; i++) {  //Проверка простоты путем деления на числа от 2 до 9
            if (num % i == 0) {
                countNod++;
                if (countNod >= 2) { //Если 2 НОД и больше выходим
                    return false;
                }
            }
        }
        return true;
    }

    public static void runPrimeGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int j; //Счетчик для сравнения количества итерации
        String[][] resultArray = new String[COUNT_STEP][2];
        for (j = 0; j < COUNT_STEP; j++) {
            int num = (int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT);
            if (defineNOD(num)) {
                resultArray[j][0] = Integer.toString(num);
                resultArray[j][1] = "yes";
            } else {
                resultArray[j][0] = Integer.toString(num);
                resultArray[j][1] = "no";
            }
        }
        Engine.run(rules, resultArray);
    }
}
