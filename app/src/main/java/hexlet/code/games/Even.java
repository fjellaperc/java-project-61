package hexlet.code.games;

public class Even {
    public static final int TOP_RANGE_LIMIT = 100;
    public static final int LOW_RANGE_LIMIT = 1;

    public static String evenRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] evenNum() {
        final int strCount = 3;
        int i; //Строка
        int j = 0; //Столбец
        String[][] arrays = new String[strCount][2];
        for (i = 0; i < arrays.length; i++) {
            int questionNum = (int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT);
            if (questionNum % 2 == 0) { //Четное
                arrays[i][j] = Integer.toString(questionNum);
                j++;
                arrays[i][j] = "yes";
                j = 0;
            } else { //Нечетное
                arrays[i][j] = Integer.toString(questionNum);
                j++;
                arrays[i][j] = "no";
                j = 0;
            }
        }
        return arrays;
    }
}
