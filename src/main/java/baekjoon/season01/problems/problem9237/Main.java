package baekjoon.season01.problems.problem9237;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 묘목 N개
        Integer[] growingTime = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            growingTime[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(growingTime, Collections.reverseOrder());
        int maxDays = 0;
        for (int i = 0; i < N; i++) {
            // 나무를 심는 순서에 따라서 추가적을 시간이 더 소요되기 때문에 +i
            // 나무를 심는데 하루 소요되기 때문에 +1
            // 나무를 다 심고 나면 하루를 더 기다려야 이장님을 초대할 수 있기 때문에 +1
            maxDays = Math.max(maxDays, growingTime[i] + i + 1 + 1);
        }

        bw.write(String.valueOf(maxDays));
        bw.flush();

        br.close();
        bw.close();
    }
}
