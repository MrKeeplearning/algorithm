package programmers.lv2.lessons178870;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {

        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;


        ArrayList<List<Integer>> numbersList = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            if (sequence[i] == k) {
                list.add(i);    // 시작인덱스
                list.add(1);    // 길이
                numbersList.add(list);
            }

            sum += sequence[i];
            list.add(i);    // 시작인덱스

            for (int j = i+1; j < sequence.length; j++) {
                sum += sequence[j];
                if (sum == k) {
                    list.add(j - i + 1);    // 길이
                    break;
                }
            }
        }

        System.out.println(numbersList);

    }
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};

        ArrayList<List<Integer>> numbersList = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            if (sequence[i] == k) {
                list.add(i);    // 시작인덱스
                list.add(1);    // 길이
                numbersList.add(list);
            }

            sum += sequence[i];
            list.add(i);    // 시작인덱스

            for (int j = i+1; j < sequence.length; j++) {
                sum += sequence[j];
                if (sum == k) {
                    list.add(j - i + 1);    // 길이
                    break;
                }
            }


        }


        return answer;
    }
}
