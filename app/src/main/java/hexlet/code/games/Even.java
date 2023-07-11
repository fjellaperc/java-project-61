package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.Random;

public class Even {
    public static final int COUNT_STEP = 3;
    public static final int TOP_RANGE_LIMIT = 101;
    public static final int LOW_RANGE_LIMIT = 1;
    public static void runEvenGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] resultArray = new String[COUNT_STEP][2];
        for (int i = 0; i < COUNT_STEP; i++) {
            int questionNum = Random.generateNum(LOW_RANGE_LIMIT, TOP_RANGE_LIMIT); //Сгенерировали число
            resultArray[i][0] = Integer.toString(questionNum); //Записали в массив
            String answer = (questionNum % 2 == 0) ? "yes" : "no"; // Правильный ответ
            resultArray[i][1] = answer; //Записали в массив
        }
        Engine.run(rules, resultArray);
    }
}
