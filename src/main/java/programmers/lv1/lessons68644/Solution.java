package programmers.lv1.lessons68644;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numbers) {
        int numbersLength = numbers.length;
        int[] numbers_combination = new int[numbersLength * numbersLength];
        int combination_count = 0;
        for (int i = 0; i < numbersLength - 1; i++) {
            for (int j = i + 1; j < numbersLength; j++) {
                numbers_combination[combination_count] = numbers[i] + numbers[j];
                combination_count++;
            }
        }
        int[] temp = Arrays.copyOfRange(numbers_combination, 0, combination_count);
        Arrays.sort(temp);

        // 밑은 위와 동일
        int[] newTemp = new int[temp.length];
        int idx = 0;
        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i] != temp[i + 1]) {
                newTemp[idx] = temp[i];
                idx++;
            }
        }
        newTemp[idx++] = temp[temp.length - 1];
        return Arrays.copyOfRange(newTemp, 0, idx);
    }
}