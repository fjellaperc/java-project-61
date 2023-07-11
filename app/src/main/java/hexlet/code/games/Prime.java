package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.Random;

public class Prime {
    public static final int COUNT_STEP = 3; // Количество раундов
    public static final int MAX_LENGTH_ARRAY = 10;
    public static final int TOP_RANGE_LIMIT = 41;
    public static final int LOW_RANGE_LIMIT = 1;

    public static boolean definePrime(int num) { // Алгоритм Евклида
        int countNod = 0;
        for (int i = 2; i < MAX_LENGTH_ARRAY; i++) {  //Проверка простоты путем деления на числа от 2 до 9
            if (num % i == 0) {
                countNod++;
                if (countNod >= 1 && num != i) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void runPrimeGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int j = 0; j < COUNT_STEP; j++) {
            int num = Random.generateNum(LOW_RANGE_LIMIT, TOP_RANGE_LIMIT);
            if (definePrime(num)) {
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
