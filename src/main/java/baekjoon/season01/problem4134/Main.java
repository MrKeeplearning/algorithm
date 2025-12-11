package baekjoon.season01.problem4134;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            long n = Long.parseLong(br.readLine());
            long result = findSmallestPrimeGreaterOrEqualToN(n);
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public static boolean isPrime(long number) {
        for (long i = 2; i*i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static long findSmallestPrimeGreaterOrEqualToN(long n) {
        if (n <= 2) return 2;   // 2 이하의 숫자는 2가 최소 소수이다.
        if (n % 2 == 0) n++;    // 짝수는 소수가 아니므로 홀수로 시작한다.

        while (!isPrime(n)) {
            n += 2; // 홀수들만 검사하도록 최적화
        }
        return n;
    }
}
