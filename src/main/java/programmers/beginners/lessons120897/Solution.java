package programmers.beginners.lessons120897;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = calculateDivisor(n);
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }

    public List<Integer> calculateDivisor(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                // 5 * 5와 같이 같은 수가 2번 저장되는 것을 방지한다.
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }
        divisors.sort(Comparator.naturalOrder());
        return divisors;
    }
}