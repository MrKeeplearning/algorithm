package programmers.beginners.lessons120882;

import java.util.*;

public class Solution2 {
    public int[] solution(int[][] scores) {
        int n = scores.length;
        double[][] studentScores = new double[n][2];
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            int[] score = scores[i];
            double average = (score[0] + score[1]) / 2.0;

            // 학생 인덱스와 평균 점수를 저장
            studentScores[i][0] = i;
            studentScores[i][1] = average;
        }

        // 평균 점수에 따라 배열을 내림차순으로 정렬
        Arrays.sort(studentScores, (a, b) -> Double.compare(b[1], a[1]));

        // 정렬된 배열에 따라 순위를 지정
        for (int i = 0, rank = 1; i < n; ++i) {
            // 현재 학생의 평균 점수가 이전 학생의 평균 점수와 같을 경우
            // 두 학생은 같은 순위를 갖게 됩니다. (따라서 이 경우에는 순위를 증가시키지 않습니다)
            if (i > 0 && studentScores[i][1] != studentScores[i - 1][1]) {
                rank = i + 1;
            }

            // 학생의 인덱스는 double로 저장되었으므로 다시 integer로 바꿔서 인덱스로 사용합니다.
            int studentIndex = (int) studentScores[i][0];
            ranks[studentIndex] = rank;
        }

        return ranks;
    }
}