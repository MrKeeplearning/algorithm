package baekjoon.season01.problem18110;

import java.io.*;
import java.util.*;

/**
 * 우선순위 큐를 활용한 풀이
 */
public class PriorityQueueSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            bw.write("0");
            bw.flush();
            return;
        }

        // 우선순위큐를 사용하면 가장 작은 값을 효율적으로 찾을 수 있음.
        // 처음 푼 풀이 대비 모든 난이도 의견을 오름차순 정렬하는 비용을 줄일 수 있음.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int trimSize = (int) Math.round(n * 0.15);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int num = pq.poll();
            if (i < trimSize || i >= n - trimSize) continue;
            sum += num;
        }

        bw.write(Math.round(sum / (n - 2 * trimSize)) + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}