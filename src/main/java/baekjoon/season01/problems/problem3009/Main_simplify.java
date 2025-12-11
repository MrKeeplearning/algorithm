package baekjoon.season01.problems.problem3009;

import java.io.*;
import java.util.StringTokenizer;

public class Main_simplify {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int ansX = x[0] == x[1] ? x[2] : (x[0] == x[2] ? x[1] : x[0]);
        int ansY = y[0] == y[1] ? y[2] : (y[0] == y[2] ? y[1] : y[0]);

        bw.write(ansX + " " + ansY + "\n");

        br.close();
        bw.close();
    }
}
