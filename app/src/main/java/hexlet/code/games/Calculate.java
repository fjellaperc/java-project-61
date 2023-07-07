package hexlet.code.games;

import hexlet.code.Engine;

public class Calculate {
    public static final int TOP_RANGE_LIMIT = 20;
    public static final int ALL_OPERATION = 3; //Для опередления количества операций
    public static final int LOW_RANGE_LIMIT = 1;
    public static final int COUNT_STEP = 3;
    public static String generateOperation() {
        String[] array = {"+", "-", "*"};
        int indexArray = (int) (Math.random() * ALL_OPERATION);
        return array[indexArray];
    }
    public static int generateNum() {
        return ((int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT));
    }
    public static int calculating(int firstNum, int secondNum, String operator) {
        int result = 0;
        switch (operator) {
            case ("+"):
                result = firstNum + secondNum;
                break;
            case ("-"):
                result = firstNum - secondNum;
                break;
            case ("*"):
                result = firstNum * secondNum;
                break;
            default:
                break;
        }
        return result;
    }
    public static void runGameCalculation() {
        String rules = "What is the result of the expression?";
        int result;
        int j = 0; //Столбец
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            int num1 = generateNum(); //Генерация первого числа
            int num2 = generateNum(); //Генерация второго числа
            String operation = generateOperation(); //Генерация знака операции
            result = calculating(num1, num2, operation); //Определение ответа
            resultArray[i][j] = num1 + " " + operation + " " + num2; //Записали вопрос в массив
            j++; // Сместили указатель столбца
            resultArray[i][j] = Integer.toString(result);
            j = 0; //Вернули указатель в исзолное положение
        }
        Engine.run(rules, resultArray);
    }
}
