package programmers.beginners.lessons120899;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] copiedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(copiedArray);
        int maxInt = copiedArray[copiedArray.length - 1];
        int indexOfMax = 0;

        int i = 0;
        while (i < array.length) {
            if (array[i] == maxInt) {
                indexOfMax = i;
                break;
            }
            i++;
        }

        answer[0] = maxInt;
        answer[1] = indexOfMax;

        return answer;
    }
}