package programmers.beginners.lessons120882;

import java.util.*;

public class Solution {
    public int[] solution(int[][] score) {
        Map<Double, Integer> map = new HashMap<>();
        int[] answer = new int[score.length];
        double[] average = new double[score.length];

        // 평균이 담긴 배열 생성
        int idx = 0;
        for (int[] ints : score) {
            double avg = (ints[0] + ints[1]) / 2.0;
            average[idx] = avg;
            idx++;
        }

        // 평균이 담긴 배열의 복사본 생성
        ArrayList<Double> copiedAverage = new ArrayList<>();
        for (double i : average) {
            copiedAverage.add(i);
        }

        // copiedAverage에 담긴 평균값을 내림차순으로 정렬
        copiedAverage.sort(Collections.reverseOrder());

        // 평균값과 순위를 map에 추가
        // 이때, 이미 map에 등록된 평균값은 건너뛴다.
        for (int i = 0; i < copiedAverage.size(); i++) {
            map.putIfAbsent(copiedAverage.get(i), i + 1);
        }

        // 기존 average 순서대로 등수를 삽입
        idx = 0;
        for (double num : average) {
            answer[idx] = map.get(num);
            idx++;
        }

        return answer;
    }
}