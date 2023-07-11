package hexlet.code.Utils;

public class Random {

    public static int generateNum(int lowRangeLimit, int topRangeLimit) {
        return (int) (Math.random() * (topRangeLimit - lowRangeLimit) + lowRangeLimit);
    }
}
