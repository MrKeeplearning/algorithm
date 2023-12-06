package programmers.beginners.lessons120833;

import java.util.Arrays;

public class Solution {
    public static int[] solution1(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers, num1, num2 + 1).toArray();
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
