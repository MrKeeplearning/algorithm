package programmers.beginners.lessons120905;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(a -> a).toArray();
    }
}