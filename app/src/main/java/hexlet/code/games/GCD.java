package hexlet.code.games;

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

    public static String gcdRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] gcd() {
        int firstNOD;
        int j = 0; //Столбец
        String[][] arrays = new String[3][3];
        int i;
        for (i = 0; i < COUNT_STEP; i++) {
            int num1 = generateNum();
            int num2 = generateNum();
            firstNOD = findGcd(num1, num2);
            arrays[i][j] = Integer.toString(num1);
            j++;
            arrays[i][j] = Integer.toString(num2);
            j++;
            arrays[i][j] = Integer.toString(firstNOD);
            j = 0;
        }
        return arrays;
    }
}
