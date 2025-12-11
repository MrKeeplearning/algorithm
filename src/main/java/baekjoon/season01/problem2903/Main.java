package baekjoon.season01.problem2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int round = Integer.parseInt(br.readLine());

        int result = ((int) Math.pow(2, round) + 1) * ((int) Math.pow(2, round) + 1);
        bw.write(result + "\n");

        br.close();
        bw.close();
    }
}
