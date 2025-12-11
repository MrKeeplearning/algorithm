package baekjoon.season01.problem25305;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            maxHeap.add(Integer.parseInt(st2.nextToken()));
        }

        for (int i = 0; i < k-1; i++) {
            maxHeap.remove();
        }

        bw.write(String.valueOf(maxHeap.peek()));

        br.close();
        bw.close();
    }
}
