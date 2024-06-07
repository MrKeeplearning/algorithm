package baekjoon.problem30802;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 참가자의 수
        int[] quantity = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            quantity[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());   // 티셔츠
        int P = Integer.parseInt(st.nextToken());   // 펜

        int answer = 0;
        for (int q : quantity) {
            answer += q / T;
            if (q % T != 0) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.write(N / P + " " + N % P);  // 펜을 P 자루씩 최대 몇 묶음 주문할 수 있는지
        bw.flush();

        br.close();
        bw.close();
    }
}
