package baekjoon.problem2750;

import java.io.*;
import java.util.*;

/**
 * 메모리 : 14676 KB
 * 시간 : 124 ms
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        while (!pq.isEmpty()) {
            bw.write(pq.remove() + "\n");
        }

        br.close();
        bw.close();
    }
}
