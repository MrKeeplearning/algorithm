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

        // 기호 1번을 제외한 후보의 득표 수를 votes에 저장
        int[] votes = new int[N - 1];
        for (int i = 0; i < N-1; i++) {
            votes[i] = Integer.parseInt(br.readLine());
        }

        // votes를 오름차순으로 정렬해서 가장 득표수가 많은 후보에서 한 명씩 매수하고, 다시 정렬하는 과정을 통해서
        // 다솜이가 당선이 될 수 있는 최소조건인지 확인한다.
        Arrays.sort(votes);
        int maxVotes = votes[votes.length - 1];
        int count = 0;  // 매수한 사람 수

        while (myVotes <= maxVotes) {
            votes[votes.length - 1]--;
            myVotes++;
            count++;

            Arrays.sort(votes);
            maxVotes = votes[votes.length - 1];
        }

        bw.write(String.valueOf(count));
        bw.flush();

        br.close();
        bw.close();
    }
}
