package baekjoon.season01.problem28279;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "1":
                    deque.addFirst(st.nextToken());
                    break;
                case "2":
                    deque.addLast(st.nextToken());
                    break;
                case "3":
                    answer.append(!deque.isEmpty() ? deque.removeFirst() + "\n" : "-1\n");
                    break;
                case "4":
                    answer.append(!deque.isEmpty() ? deque.removeLast() + "\n" : "-1\n");
                    break;
                case "5":
                    answer.append(deque.size()).append("\n");
                    break;
                case "6":
                    answer.append(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case "7":
                    answer.append(!deque.isEmpty() ? deque.peekFirst() + "\n" : "-1\n");
                    break;
                case "8":
                    answer.append(!deque.isEmpty() ? deque.peekLast() + "\n" : "-1\n");
                    break;
            }
        }

        bw.write(answer.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}
