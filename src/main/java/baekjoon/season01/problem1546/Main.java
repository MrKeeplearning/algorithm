package baekjoon.season01.problem1546;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            double[] scores = new double[N];
            double maxScore = -1;
            double sum = 0;
            int idx = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                scores[idx] = Double.parseDouble(st.nextToken());
                if (scores[idx] > maxScore) {
                    maxScore = scores[idx];
                }
                idx++;
            }

            for (int i = 0; i < N; i++) {
                scores[i] = scores[i] / maxScore * 100;
                sum += scores[i];
            }

            bw.write(String.format("%.6f", sum / N));

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
