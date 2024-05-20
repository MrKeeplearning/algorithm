package baekjoon.problem2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(i + 1));
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
