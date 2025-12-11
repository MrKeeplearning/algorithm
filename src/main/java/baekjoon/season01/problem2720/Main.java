package baekjoon.season01.problem2720;

import java.io.*;

public class Main {

    public static final int QUARTER = 25;
    public static final int DIME = 10;
    public static final int NICKEL = 5;
    public static final int PENNY = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            String answer = changeCount(change);
            bw.write(answer + "\n");
        }
        br.close();
        bw.close();
    }

    public static String changeCount(int change) {
        int q, d, n, p = 0;

        q = change / QUARTER;
        change %= QUARTER;

        d = change / DIME;
        change %= DIME;

        n = change / NICKEL;
        change %= NICKEL;

        p = change / PENNY;

        return q + " " + d + " " + n + " " + p;
    }
}