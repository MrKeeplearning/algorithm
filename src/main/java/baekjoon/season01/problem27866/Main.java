package baekjoon.season01.problem27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        bw.write(S.charAt(i - 1));
        bw.flush();

        br.close();
        bw.close();
    }
}
