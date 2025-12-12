package baekjoon.season02.problems.problem17427;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        long answer = 0;

        for (int i = 1; i <= N; i++) {
            answer += i * (N / i);
        }

        bw.write(String.valueOf(answer));
        bw.flush();

        br.close();
        bw.close();
    }
}
