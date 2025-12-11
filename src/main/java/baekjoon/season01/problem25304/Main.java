package baekjoon.season01.problem25304;

import java.io.*;
import java.util.*;

public class Main {
    static int X, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        X = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a * b;
        }

        bw.write(X - sum == 0 ? "Yes" : "No");

        br.close();
        bw.close();
    }
}
