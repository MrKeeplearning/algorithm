package programmers.beginners.lessons120583;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(i -> i == n)
                .count();
    }
}
