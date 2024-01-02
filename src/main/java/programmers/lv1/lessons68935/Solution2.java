package programmers.lv1.lessons68935;

import java.util.*;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        while (n != 0) {
            deque.offer(n % 3);
            n /= 3;
        }

        int idx = deque.size() - 1;
        for (Integer value : deque) {
            answer += (int) (value * Math.pow(3, idx));
            idx--;
        }

        return answer;
    }
}
