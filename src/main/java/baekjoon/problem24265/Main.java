package baekjoon.problem24265;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long count = (long) n * (n - 1) / 2;

        bw.write(count + "\n");
        // O(n^2)의 시간복잡도를 가지기 때문에 차수는 2
        bw.write("2");
        bw.flush();

        br.close();
        bw.close();
    }
}
