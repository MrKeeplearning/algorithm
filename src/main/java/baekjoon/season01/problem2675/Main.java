package baekjoon.season01.problem2675;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder sb = new StringBuilder();
            for (char c : S.toCharArray()) {
                String repeated = String.valueOf(c).repeat(R);
                sb.append(repeated);
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
