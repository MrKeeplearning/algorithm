package baekjoon.season02.problems.problem1929;

import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_NUMBER = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] primes = getPrimes(MAX_NUMBER);

        for (int i = M; i <= N ; i++) {
            if (primes[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    private static boolean[] getPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0과 1은 소수가 아니기 때문에 제외
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // i의 배수들은 모두 지운다.
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
