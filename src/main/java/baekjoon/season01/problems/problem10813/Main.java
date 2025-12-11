package baekjoon.season01.problems.problem10813;

import java.util.*;
import java.io.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 바구니 초기화
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        // 공 교환
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            // 바구니 번호와 실제 인덱스 정보는 다르기 때문에 - 1
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        // 결과
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        bw.write(sb.toString().trim());

        br.close();
        bw.close();
    }
}
