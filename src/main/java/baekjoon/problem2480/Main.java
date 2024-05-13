package baekjoon.problem2480;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dice = new int[3];
        for (int i = 0; i < 3; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dice);

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            bw.write(String.valueOf(10000 + dice[0] * 1000));
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            bw.write(String.valueOf(1000 + dice[1] * 100));
        } else {
            bw.write(String.valueOf(dice[2] * 100));
        }

        br.close();
        bw.close();

    }
}
