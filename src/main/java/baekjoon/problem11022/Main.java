package baekjoon.problem11022;

import java.io.*;
import java.util.*;

public class Main {

    static int T, A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = A + B;
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + C);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
