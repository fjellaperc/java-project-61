package hexlet.code.games;

public class Prime {
    public static final int TOP_RANGE_LIMIT = 12; //Верхняя граница от 2 до 100
    public static final int LOW_RANGE_LIMIT = 2; //Нижняя граница
    public static final int COUNT_STEP = 3;
    public static final int MAX_LENGTH_ARRAY = 10;

    public static boolean defineNOD(int num) {
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
    } //Евклид

    public static String primeRulesShow() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static String[][] primeDefine() {
        int j; //Счетчик для сравнения количества итерации
        final int strCount = 3;
        String[][] array = new String[strCount][2];
        for (j = 0; j < COUNT_STEP; j++) {
            int num = (int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT);
            if (defineNOD(num)) {
                array[j][0] = Integer.toString(num);
                array[j][1] = "yes";
            } else {
                array[j][0] = Integer.toString(num);
                array[j][1] = "no";
            }
        }
        return array;
    }
}
