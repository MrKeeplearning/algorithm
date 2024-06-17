package baekjoon.problem2869;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int day = 0;
        int cur = 0;

        while (day < v + 1) {
            day++;
            cur = cur + a;
            if (cur >= v) {
                bw.write(day);
                break;
            } else {
                cur = cur - b;
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
