package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.Random;


public class Calculate {
    public static final int COUNT_STEP = 3; //Для опередления количества операций
    public static final int TOP_RANGE_LIMIT = 101;
    public static final int LOW_RANGE_LIMIT = 1;
    public static String generateOperation() {
        String[] array = {"+", "-", "*"};
        int indexArray = Random.generateNum(0, COUNT_STEP);
        return array[indexArray];
    }
    public static int calculating(int firstNum, int secondNum, String operator) {
        switch (operator) {
            case ("+"):
                return firstNum + secondNum;
            case ("-"):
                return firstNum - secondNum;
            case ("*"):
                return firstNum * secondNum;
            default:
                return 1;
        }
    }
    public static void runGameCalculation() {
        String rules = "What is the result of the expression?";
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            int num1 = Random.generateNum(LOW_RANGE_LIMIT, TOP_RANGE_LIMIT); //Генерация первого числа
            int num2 = Random.generateNum(LOW_RANGE_LIMIT, TOP_RANGE_LIMIT); //Генерация второго числа
            String operation = generateOperation(); //Генерация знака операции
            int result = calculating(num1, num2, operation); //Определение ответа
            resultArray[i][0] = num1 + " " + operation + " " + num2; //Записали вопрос в массив
            resultArray[i][1] = Integer.toString(result);
        }
        Engine.run(rules, resultArray);
    }
}
