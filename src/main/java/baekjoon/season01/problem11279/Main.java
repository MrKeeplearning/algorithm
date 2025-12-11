package baekjoon.season01.problem11279;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            if (maxHeap.isEmpty() && number == 0) {
                bw.write("0");
                bw.newLine();
            } else if (number == 0) {
                bw.write(String.valueOf(maxHeap.poll()));
                bw.newLine();
            } else {
                maxHeap.add(number);
            }
        }

        br.close();
        bw.close();
    }
}
