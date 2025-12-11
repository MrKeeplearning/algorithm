package baekjoon.season01.problems.problem18258;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<String> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                String n = st.nextToken();
                queue.add(n);
            } else {
                switch (command) {
                    case "pop":
                        sb.append(!queue.isEmpty() ? queue.poll() + "\n" : "-1\n");
                        break;
                    case "size":
                        sb.append(queue.size()).append("\n");
                        break;
                    case "empty":
                        sb.append(queue.isEmpty() ? "1\n" : "0\n");
                        break;
                    case "front":
                        sb.append(!queue.isEmpty() ? queue.peek() + "\n" : "-1\n");
                        break;
                    case "back":
                        sb.append(!queue.isEmpty() ? queue.getLast() + "\n" : "-1\n");
                        break;
                }
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
