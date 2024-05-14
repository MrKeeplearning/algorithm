package baekjoon.problem10810;

import java.util.*;
import java.io.*;

public class Main {
    // 바구니 총 N개, 바구니 번호도 1~N번까지
    // 1~N번까지 번호가 적힌 공을 가지고 있음
    // 도현이가 앞으로 M회 공을 넣을 것임.
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // N번 바구니까지 있음. 번호도 마찬가지
        M = Integer.parseInt(st.nextToken());   // 횟수

        int[] arr = new int[N];

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int b = i-1; b < j; b++) {
                arr[b] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }

        bw.write(sb.toString().trim());

        br.close();
        bw.close();
    }
}
