package baekjoon.season01.problem10828;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayDeque<String> deq = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            String number = null;
            if (st.hasMoreTokens()) {
                number = st.nextToken();
            }

            switch (command) {
                case "push":
                    push(deq, number);
                    break;
                case "pop":
                    String pop = pop(deq);
                    bw.write(pop + "\n");
                    break;
                case "size":
                    int size = size(deq);
                    bw.write(size + "\n");
                    break;
                case "empty":
                    String empty = empty(deq);
                    bw.write(empty + "\n");
                    break;
                case "top":
                    String top = top(deq);
                    bw.write(top + "\n");
                    break;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }

    static void push(ArrayDeque<String> deq, String x) {
        deq.offer(x);
    }

    static String pop(ArrayDeque<String> deq) {
        if (!deq.isEmpty()) {
            return deq.pollLast();
        } else {
            return "-1";
        }
    }

    static int size(ArrayDeque<String> deq) {
        return deq.size();
    }

    static String empty(ArrayDeque<String> deq) {
        return deq.isEmpty() ? "1" : "0";
    }

    static String top(ArrayDeque<String> deq) {
        if (!deq.isEmpty()) {
            return deq.peekLast();
        } else {
            return "-1";
        }
    }
}
