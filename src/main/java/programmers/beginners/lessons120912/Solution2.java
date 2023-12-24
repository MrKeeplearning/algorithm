package programmers.beginners.lessons120912;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] array) {
        return (int) Arrays.stream(array)
                .mapToObj(Integer::toString)
                .flatMapToInt(String::chars)
                .filter(ch -> ch == '7')
                .count();
    }
}
