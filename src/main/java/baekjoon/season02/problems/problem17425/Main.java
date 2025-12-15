package baekjoon.season02.problems.problem17425;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int MAX = 1_000_000;

        // fx[i] : i의 약수의 합을 저장하는 배열
        long[] fx = new long[MAX + 1];

        // gx[i] : 1부터 i까지의 f(x)의 누적합을 저장하는 배열
        long[] gx = new long[MAX + 1];

        // 에라토스테네스의 체 원리를 이용해 fx 채우기
        Arrays.fill(fx, 1);

        for (int i = 2; i <= MAX; i++) {
            // j는 i의 배수들
            for (int j = 1; i * j <= MAX; j++) {
                fx[i * j] += i; // i의 배수 위치에 값 i를 더해준다.
            }
        }

        // 누적 합을 계산하며 gx 채우기
        for (int i = 1; i <= MAX; i++) {
            gx[i] = gx[i - 1] + fx[i];
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            bw.write(gx[n] + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }

}
