package programmers.lv2.lessons178870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution3 {

    public static void main(String[] args) {
        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;

        List<List<Integer>> answerList = new ArrayList<>();
        ArrayList<Integer> startIdx = new ArrayList<>();
        ArrayList<Integer> answerLength = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < sequence.length; j++) {
                sum += sequence[j];
                list.add(sequence[j]);
                if (sum == k) {
                    answerList.add(list);
                    startIdx.add(i);
                    break;
                }
            }
        }

        for (List<Integer> integers : answerList) {
            answerLength.add(integers.size());
        }

        System.out.println(answerList);
        System.out.println(answerLength);
        answerLength.sort(Comparator.naturalOrder());
        System.out.println(startIdx);

        answerLength.sort((Comparator.comparingInt(o -> o)));
        System.out.println(answerLength);
    }


    class Solution {
        public int[] solution(int[] sequence, int k) {
            int[] answer = {};
            return answer;
        }
    }
}
