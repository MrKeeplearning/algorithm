package baekjoon.problem1417;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int myVotes = Integer.parseInt(br.readLine());  // 기호 1번 득표수

        if (N == 1) {
            bw.write("0");
            bw.flush();
            return;
        }

        int[] votes = new int[N - 1];

        for (int i = 0; i < N-1; i++) {
            votes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(votes);
        int maxVotes = votes[votes.length - 1];

        while (myVotes < maxVotes) {
            Arrays.sort(votes);
        }

        br.close();
        bw.close();
    }
}
