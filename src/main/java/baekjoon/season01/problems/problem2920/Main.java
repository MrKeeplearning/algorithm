package baekjoon.season01.problems.problem2920;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cMajor = new int[8];
        for (int i = 0; i < 8; i++) {
            cMajor[i] = Integer.parseInt(st.nextToken());
        }
        String result = "";

        for (int i = 0; i < cMajor.length - 1; i++) {
            if (cMajor[i] == cMajor[i + 1] - 1) {
                result = "ascending";
            } else if (cMajor[i] == cMajor[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        bw.write(result);
        bw.flush();

        br.close();
        bw.close();
    }
}
