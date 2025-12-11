package baekjoon.season01.problem9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sb.setLength(0);
            String s = br.readLine();
            int length = s.length();
            sb.append(s.charAt(0)).append(s.charAt(length - 1));
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
