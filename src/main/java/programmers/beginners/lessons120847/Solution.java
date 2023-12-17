package programmers.beginners.lessons120847;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int lengthOfArray = numbers.length;
        return numbers[lengthOfArray - 1] * numbers[lengthOfArray - 2];
    }
}