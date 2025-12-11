package baekjoon.season01.problem1389;

import java.io.*;

public class Main {

    static int M, N;
    static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
