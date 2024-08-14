package baekjoon.problem9063;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            bw.write("0");
        } else {
            int[] valueX = new int[N];
            int[] valueY = new int[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                valueX[i] = Integer.parseInt(st.nextToken());
                valueY[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(valueX);
            Arrays.sort(valueY);

            int answer = (valueX[N - 1] - valueX[0]) * (valueY[N - 1] - valueY[0]);
            bw.write(String.valueOf(answer));
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
