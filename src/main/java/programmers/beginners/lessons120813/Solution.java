package programmers.beginners.lessons120813;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int n) {
        List<Integer> integers = checkEven(n);
        int[] answer = new int[integers.size()];
        int i = 0;
        for (Integer integer : integers) {
            answer[i++] = integer;
        }
        return answer;
    }

    public static List<Integer> checkEven(int n) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                integers.add(i);
            }
        }
        return integers;
    }
}