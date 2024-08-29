package baekjoon.problem19532;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int denominator = a * e - b * d;
        if (denominator != 0) {
            int x = (c * e - b * f) / denominator;
            int y = (a * f - c * d) / denominator;
            bw.write(x + " " + y + "\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}