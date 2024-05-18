package baekjoon;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        int K = 24;
        System.out.println("P value: " + findPosition(N, K));

    }

    static int findPosition(int n, int k) {
        for (int i = 1; i <= n; i++) {
            BigInteger count = combination(n - i, 1);
            if (count.compareTo(BigInteger.valueOf(k)) >= 0) {
                return i + k;
            }
            k -= count.intValue();
        }
        return -1;
    }

    static BigInteger combination(int n, int k) {
        if (k == 0 || k == n) {
            return BigInteger.ONE;
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            res = res.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        return res;
    }
}