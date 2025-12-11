package baekjoon.season01.problem2587;

import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int median = 0;
        int sum = 0;
        int avg;

        for (int i = 0; i < 5; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 5; i++) {
            int num = pq.remove();
            sum += num;
            if (i == 2) {
                median = num;
            }
        }

        avg = sum / 5;

        bw.write(avg + "\n");
        bw.write(median + "\n");

        br.close();
        bw.close();
    }
}
