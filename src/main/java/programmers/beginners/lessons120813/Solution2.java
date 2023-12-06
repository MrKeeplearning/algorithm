package programmers.beginners.lessons120813;

import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(value -> value % 2 == 1)
                .toArray();
    }
}
