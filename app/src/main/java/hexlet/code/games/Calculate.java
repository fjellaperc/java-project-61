package hexlet.code.games;

public class Calculate {
    public static final int TOP_RANGE_LIMIT = 20;
    public static final int ALL_OPERATION = 3; //Для опередления количества операций
    public static final int LOW_RANGE_LIMIT = 1;
    public static final int ALL_STEP = 3;

    public static String generateOperation() {
        String[] array = {"+", "-", "*"};
        int indexArray = (int) (Math.random() * ALL_OPERATION);
        return array[indexArray];
    }

    public static int generateNum() {
        return ((int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT));
    }

    public static int calculate(int firstNum, int secondNum, String operator) {
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

    public static String ruleCalcShow() {
        return "What is the result of the expression?";
    }

    public static String[][] calculation() {
        final int strCount = 3;
        final int columnCount = 4;
        int result;
        int i; //Строка
        int j = 0; //Столбец
        String[][] arrays = new String[strCount][columnCount];
        for (i = 0; i < ALL_STEP; i++) {
            int num1 = generateNum();
            int num2 = generateNum();
            String operation = generateOperation();
            //System.out.println("Question: " + num1 + " " + operation + " " + num2);
            result = calculate(num1, num2, operation);
            arrays[i][j] = Integer.toString(num1);  //Первое число
            j++;
            arrays[i][j] = operation; //Знак
            j++;
            arrays[i][j] = Integer.toString(num2); //Второе число
            j++;
            arrays[i][j] = Integer.toString(result); //Результат
            j = 0;
        }
        return arrays;
    }
}
