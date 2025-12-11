package baekjoon.season01.problem1978;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (isPrime(number)) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;   // 나누어 떨어지는 숫자가 있다면 소수가 아님.
            }
        }
        return true;    // 나누어 떨어지는 숫자가 없으면 소수
    }
}
