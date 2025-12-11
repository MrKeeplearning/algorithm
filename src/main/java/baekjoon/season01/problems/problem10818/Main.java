package baekjoon.season01.problems.problem10818;

import java.io.*;
import java.util.*;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstNumber = Integer.parseInt(st.nextToken());
        int min = firstNumber;
        int max = firstNumber;

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        bw.write(min + " " + max);

        br.close();
        bw.close();
    }
}
