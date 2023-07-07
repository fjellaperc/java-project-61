package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final int TOP_RANGE_LIMIT = 100;
    public static final int LOW_RANGE_LIMIT = 1;
    public static final int COUNT_STEP = 3;
    public static void runEvenGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int j = 0; //Столбец
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            int questionNum = (int) (Math.random() * TOP_RANGE_LIMIT + LOW_RANGE_LIMIT); //Сгенерировали число
            resultArray[i][j] = Integer.toString(questionNum); //Записали в массив
            j++; // Сменили столбец
            String answer = (questionNum % 2 == 0) ? "yes" : "no"; // Правильный ответ
            resultArray[i][j] = answer; //Записали в массив
            j = 0; // Поставили указатель на нулевой столбец
        }
        Engine.run(rules, resultArray);
    }
}
