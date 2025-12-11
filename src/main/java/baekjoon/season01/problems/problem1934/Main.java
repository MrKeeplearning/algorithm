package baekjoon.season01.problems.problem1934;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(lcm(A, B) + "\n");
        }

        br.close();
        bw.close();
    }

    public static int euclidGCD(int e1, int e2) {
        int a = Math.max(e1, e2);
        int b = Math.min(e1, e2);

        if (b == 0) {
            return a;
        }
        return euclidGCD(b, a % b);
    }

    public static int lcm(int l1, int l2) {
        int gcd = euclidGCD(l1, l2);
        return Math.abs(l1 * l2) / gcd;
    }
}
