package baekjoon.season01.problem25314;

import java.io.*;

public class Main {

    static int N, iterTimes;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        iterTimes = N / 4;

        for (int i = 0; i < iterTimes; i++) {
            bw.write("long ");
        }
        bw.write("int");

        br.close();
        bw.close();
    }
}
