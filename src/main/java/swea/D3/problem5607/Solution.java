package swea.D3.problem5607;

import java.io.*;
import java.util.*;

/**
 * 팩토리얼 함수에서 값이 너무 커져서 실패하게 됨!
 * 페르마의 소정리와 모듈러 역원을 사용해야 한다고 함...
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            long combination = factorial(N) / (factorial(R) * factorial(N - R));
            long result = combination % 1234567891;

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append(" ").append(result);
            bw.write(sb.toString());
            bw.flush();
        }
        br.close();
        bw.close();
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
