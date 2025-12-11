package baekjoon.season01.problems.problem2501;

import java.io.*;
import java.util.*;

public class Main_simplify {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            // 약수가 하나 나올 때마다 count 1씩 증가
            if (N % i == 0) {
                count++;
            }

            // K번째 약수 찾기
            if (count == K) {
                result = i;
                break;
            }
        }

        bw.write(result + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
