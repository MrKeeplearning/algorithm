package programmers.beginners.lessons120854;

import java.util.Arrays;

public class Solution2 {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
