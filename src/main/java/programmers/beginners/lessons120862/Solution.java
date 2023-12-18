package programmers.beginners.lessons120862;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int lengthOfArray = numbers.length;
        Arrays.sort(numbers);

        int high = numbers[lengthOfArray - 1] * numbers[lengthOfArray - 2];
        int low = numbers[0] * numbers[1];
        return Math.max(high, low);
    }
}