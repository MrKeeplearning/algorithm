package programmers.beginners.lessons120878;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int a, int b) {
        int answer = 0;
        int gcd = gcd(a, b);
        int denominator = b / gcd;

        if (isFiniteDecimal(denominator)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public boolean isFiniteDecimal(int denominator) {
        boolean containsOther = true;
        for (Integer integer : primeFactors(denominator)) {
            if (integer != 2 && integer != 5) {
                containsOther = false;
                break;
            }
        }
        return containsOther;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public List<Integer> primeFactors(int n) {

        List<Integer> factors = new ArrayList<Integer>();

        // 2로 나눌 수 있는 동안 2를 리스트에 추가하고, n을 2로 나눈다
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // 이 시점에서 n은 홀수이다. 그러므로 i는 3에서 시작해서 2씩 증가시키며 n보다 작거나 같도록 반복한다
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // n이 i로 나누어떨어지는 동안 i를 리스트에 추가하고 n을 i로 나눈다.
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // 마지막으로 n이 2보다 크다면 이는 n이 소수라는 의미이다
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}