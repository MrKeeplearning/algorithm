package programmers.beginners.lessons120812;

import java.util.HashMap;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxValue;
        int preMaxIndex;

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int number : array) {
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number) + 1);
            } else {
                countMap.put(number, 1);
            }
        }

        maxValue = -1;
        preMaxIndex = -1;

        for (int key : countMap.keySet()) {
            if (maxValue < countMap.get(key)) {
                maxValue = countMap.get(key);
                answer = key;
            } else if (maxValue == countMap.get(key)) {
                preMaxIndex = key;
            }
        }
        if (countMap.get(answer) == countMap.get(preMaxIndex)) {
            answer = -1;
            return answer;
        }
        return answer;
    }
}