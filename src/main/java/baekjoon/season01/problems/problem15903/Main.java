package baekjoon.season01.problems.problem15903;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());    // 카드의 개수
        int m = Integer.parseInt(st.nextToken());    // 카드 합체 횟수
        long result = 0; // 가장 작은 점수
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // 최소힙으로 구현된 PriorityQueue 에 값을 담아서 값을 하나씩 뽑을 때마다 가장 작은 값을 뽑을 수 있도록 한다.
        // 가장 작은 값 2개를 뽑아 더한 뒤 다시 PriorityQueue 에 담는다.
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            long a = pq.remove();
            long b = pq.remove();
            pq.add(a + b);
            pq.add(a + b);
        }

        // PriorityQueue 에 담긴 모든 값을 더해서 결과를 출력한다.
        while (!pq.isEmpty()) {
            result += pq.remove();
        }
        bw.write(String.valueOf(result));
        bw.flush();

        br.close();
        bw.close();
    }
}
