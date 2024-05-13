package baekjoon.problem18108;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int buddhistYear = Integer.parseInt(br.readLine());
        int christianYear = buddhistYear - 543;
        bw.write(String.valueOf(christianYear));

        br.close();
        bw.close();
    }
}
