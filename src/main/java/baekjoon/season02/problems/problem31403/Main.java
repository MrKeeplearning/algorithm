package baekjoon.season02.problems.problem31403;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        bw.write(asNumber(A, B, C) + "\n" + asString(A, B, C));
        bw.flush();

        br.close();
        bw.close();
    }

    private static int asNumber(String A, String B, String C) {
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
        return a + b - c;
    }

    private static int asString(String A, String B, String C) {
        int ab = Integer.parseInt(A + B);
        return ab - Integer.parseInt(C);
    }
}
