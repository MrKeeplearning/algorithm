package programmers.beginners.lessons120583;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int[] array, int n) {
        ArrayList<Integer> countN = new ArrayList<>();
        Arrays.sort(array);
        int index = 0;
        while (index < array.length && array[index] <= n) {
            if (array[index] == n) {
                countN.add(array[index]);
            }
            index++;
        }
        return countN.size();
    }
}