package baekjoon.season01.problems.problem10989;

import java.io.*;
import java.util.*;

/**
 * 메모리 초과가 발생하는 풀이
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> integers = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            integers.add(Integer.parseInt(br.readLine()));
        }

        while (!integers.isEmpty()) {
            bw.write(integers.poll() + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
