package programmers.beginners.lessons120585;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        Arrays.sort(array);

        for (int heightOfFriend : array) {
            if (heightOfFriend > height) {
                break;
            }
            count++;
        }

        return array.length - count;
    }
}
