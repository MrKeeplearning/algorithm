package programmers.beginners.lessons120852;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i * i <= n; ++i) {
            while (n % i == 0) {
                if (!factors.contains(i)) {
                    factors.add(i);
                }
                n /= i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        int[] answer = new int[factors.size()];
        for (int i = 0; i < factors.size(); ++i) {
            answer[i] = factors.get(i);
        }

        return answer;
    }
}