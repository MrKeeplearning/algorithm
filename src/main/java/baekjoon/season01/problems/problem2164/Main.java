package baekjoon.season01.problems.problem2164;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (!deque.isEmpty()) {
            int first = deque.pollFirst();
            if (deque.isEmpty()) {
                bw.write(String.valueOf(first));
                break;
            } else {
                int number = deque.pollFirst();
                deque.addLast(number);
            }
        }

        br.close();
        bw.close();
    }
}
