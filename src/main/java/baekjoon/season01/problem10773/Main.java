package baekjoon.season01.problem10773;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new LinkedList<>();

        int answer = 0;
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (!deque.isEmpty() && n == 0) {
                answer -= deque.pop();
            } else {
                deque.push(n);
                answer += n;
            }
        }

        bw.write(answer + "\n");
        br.close();
        bw.close();
    }
}
