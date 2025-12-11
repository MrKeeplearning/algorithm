package baekjoon.season01.problem1024;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        boolean found = false;

        for (int l = L; l <= 100; l++) {
            int numerator = 2 * N - l * (l - 1);
            int denominator = 2 * l;

            if (numerator % denominator == 0) {
                int a = numerator / denominator;
                if (a >= 0) {
                    found = true;
                    for (int i = 0; i < l; i++) {
                        bw.write((a + i) + " ");
                    }
                    break;
                }
            }
        }

        if (!found) {
            bw.write("-1");
        }

        br.close();
        bw.close();
    }
}
