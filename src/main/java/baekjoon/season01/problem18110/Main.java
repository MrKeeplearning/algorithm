package baekjoon.season01.problem18110;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());    // 난이도 의견의 개수 n

        // 난이도 의견이 완전히 주어지지 않은 경우에는 절사평균을 계산할 수 없다.
        if (n == 0) {
            bw.write(String.valueOf(0));
            bw.flush();
            return;
        }

        int[] difficultyOpinions = new int[n];
        int ignoreOpinions = (int) Math.round(n * 0.15);    // 절사평균을 적용했을 때 위아래에서 제거할 의견 수
        int trimmedOpinions = n - 2 * ignoreOpinions;   // 위아래 15%를 제외한 의견의 수
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            difficultyOpinions[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(difficultyOpinions);    // 모든 난이도 의견을 오름차순 정렬.

        // 위아래 15%를 제외한 의견들을 가지고 절사평균을 계산한다.
        for (int i = ignoreOpinions; i < n - ignoreOpinions; i++) {
            sum += difficultyOpinions[i];
        }

        int trimmedMean = (int) Math.round(sum / trimmedOpinions);
        bw.write(String.valueOf(trimmedMean));
        bw.flush();

        br.close();
        bw.close();
    }
}
