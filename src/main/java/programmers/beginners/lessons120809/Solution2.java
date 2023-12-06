package programmers.beginners.lessons120809;

import java.util.Arrays;

public class Solution2 {
    //stream 사용하기
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map(i -> i * 2)
                .toArray();
    }
}
