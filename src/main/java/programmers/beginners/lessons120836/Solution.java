package programmers.beginners.lessons120836;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int n) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (integers.contains(i)) {
                break;
            } else {
                addDivisor(n, i, integers);
            }
        }
        return integers.size();
    }

    public static void addDivisor(int n, int i, Set<Integer> integers) {
        if (n % i == 0) {
            integers.add(i);
            integers.add(n / i);
        }
    }
}