package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static final int TOP_RANGE_LIMIT = 5;
    public static final int LOW_RANGE_LIMIT = 1;
    public static final int COUNT_STEP = 3;

    public static int generateNum() {
        return (int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT);
    }

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
        int j = 0; //Столбец
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            int num1 = generateNum();
            int num2 = generateNum();
            firstNOD = findGcd(num1, num2);
            resultArray[i][j] = num1 + " " + num2;
            j++;
            resultArray[i][j] = Integer.toString(firstNOD);
            j = 0;
        }
        Engine.run(rules, resultArray);
    }
}
