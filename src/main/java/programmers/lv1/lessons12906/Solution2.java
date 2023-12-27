package programmers.lv1.lessons12906;

import java.util.ArrayList;

public class Solution2 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;
        for (int num : arr) {
            if (prev != num) {
                list.add(num);
                prev = num;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
