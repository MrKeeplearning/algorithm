package baekjoon.problem13241;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        bw.write(lcm(a, b) + "\n");

        br.close();
        bw.close();
    }

    public static long euclidGCD(long e1, long e2) {
        long a = Math.max(e1, e2);
        long b = Math.min(e1, e2);

        if (b == 0) {
            return a;
        }
        return euclidGCD(b, a % b);
    }

    public static long lcm(long l1, long l2) {
        long gcd = euclidGCD(l1, l2);
        return Math.abs(l1 * l2) / gcd;
    }
}

