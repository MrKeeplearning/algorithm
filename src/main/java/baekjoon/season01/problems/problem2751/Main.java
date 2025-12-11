package baekjoon.season01.problems.problem2751;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            minHeap.offer(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < N; i++) {
            bw.write(minHeap.remove() + "\n");
        }
        
        br.close();
        bw.close();
    }
}
