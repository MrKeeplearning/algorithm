package baekjoon.season01.problems.problem2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.setLength(0);
            sb.append(" ".repeat(N - (i + 1)));
            sb.append("*".repeat((i + 1) * 2 - 1));
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        for (int i = 0; i < N-1; i++) {
            sb.setLength(0);
            sb.append(" ".repeat(i + 1));
            sb.append("*".repeat((N - 1 - i) * 2 - 1));
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
