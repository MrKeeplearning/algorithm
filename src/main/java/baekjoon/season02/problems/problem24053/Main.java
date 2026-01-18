package baekjoon.season02.problems.problem24053;

import java.io.*;
import java.util.*;

public class Main {

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {

            // B[0..i] 가 오름차순인지 확인
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (B[j] > B[j + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (!sorted) {
                continue;
            }

            // B[i+1..] 가 A[i+1..] 와 동일한지 확인
            boolean sameSuffix = true;
            for (int j = i + 1; j < N; j++) {
                if (B[j] != A[j]) {
                    sameSuffix = false;
                    break;
                }
            }
            if (!sameSuffix) {
                continue;
            }

            // 두 조건 모두 만족 → 정답
            bw.write("1");
            bw.flush();
            return;
        }

        bw.write("0");
        bw.flush();

        br.close();
        bw.close();
    }
}
