package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.Random;

public class GCD {
    public static final int COUNT_STEP = 3;
    public static final int TOP_RANGE_LIMIT = 30;
    public static final int LOW_RANGE_LIMIT = 1;
    public static int findGcd(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        return secondNumber + firstNumber;
    }
    public static void runGameGcd() {
        String rules = "Find the greatest common divisor of given numbers.";
        int firstNOD;
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            int num1 = Random.generateNum(LOW_RANGE_LIMIT, TOP_RANGE_LIMIT);
            int num2 = Random.generateNum(LOW_RANGE_LIMIT, TOP_RANGE_LIMIT);
            firstNOD = findGcd(num1, num2);
            resultArray[i][0] = num1 + " " + num2;
            resultArray[i][1] = Integer.toString(firstNOD);
        }
        Engine.run(rules, resultArray);
    }
}
