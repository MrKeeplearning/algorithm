package baekjoon.problem15655;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                temp = pq.poll();
            }
            while (!pq.isEmpty()) {
                bw.write(temp + " " + pq.poll());
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}
