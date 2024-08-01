package baekjoon.problem1927;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());

            if (minHeap.isEmpty() && number == 0) {
                bw.write("0");
                bw.newLine();
            } else if (number == 0) {
                Integer polledNumber = minHeap.poll();
                bw.write(String.valueOf(polledNumber));
                bw.newLine();
            } else {
                minHeap.add(number);
            }
        }

        br.close();
        bw.close();
    }
}
