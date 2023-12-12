package programmers.lv1.lessons68644;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {

    /**
     * 리스트로 풀기
     */
    public int[] solution(int[] numbers) {
        int numbersLength = numbers.length;
        ArrayList<Integer> number_combination = new ArrayList<>();

        for (int i = 0; i < numbersLength - 1; i++) {
            for (int j = i + 1; j < numbersLength; j++) {
                int combination = numbers[i] + numbers[j];
                if (!number_combination.contains(combination)) {
                    number_combination.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(number_combination);
        int[] answer = new int[number_combination.size()];
        for (int i = 0; i < number_combination.size(); i++) {
            answer[i] = number_combination.get(i);
        }

        return answer;
    }
}