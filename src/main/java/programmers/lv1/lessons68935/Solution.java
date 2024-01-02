package programmers.lv1.lessons68935;

import java.util.ArrayList;

public class Solution {

    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        int num = 3;

        while (true) {
            list.add(n % num);
            n = n / num;
            if (n == 0) {
                break;
            }
        }

        int e = list.size()-1;
        for (Integer i : list) {
            answer += (int) (i * (Math.pow(3, e)));
            e--;
        }

        return answer;
    }
}